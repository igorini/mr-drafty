package com.igorini.mrdrafty.bot

import com.igorini.mrdrafty.MrDrafty
import com.igorini.mrdrafty.card.Card
import com.igorini.mrdrafty.card.CardColor
import com.igorini.mrdrafty.card.CardRarity
import com.igorini.mrdrafty.card.CardType
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject
import org.nield.kotlinstatistics.percentile

/** Provides card statistics */
class CardStats : KoinComponent {

    val mrDrafty: MrDrafty by inject()

    fun printMedianCards() {
        val allCards = mrDrafty.allCards
        println("---[MEDIAN RARE HERO]---")
        val rareHeroes = allCards.filter { it.type() == CardType.HERO && it.rarity() == CardRarity.RARE }
        println("RED: ${medianScore(rareHeroes.filter { it.color() == CardColor.RED })}")
        println("BLACK: ${medianScore(rareHeroes.filter { it.color() == CardColor.BLACK })}")
        println("GREEN: ${medianScore(rareHeroes.filter { it.color() == CardColor.GREEN })}")
        println("BLUE: ${medianScore(rareHeroes.filter { it.color() == CardColor.BLUE })}")
        println("ALL: ${medianScore(rareHeroes)}")

        println()
        println("---[MEDIAN UNCOMMON HERO]---")
        val uncommonHeroes = allCards.filter { it.type() == CardType.HERO && it.rarity() == CardRarity.UNCOMMON }
        println("RED: ${medianScore(uncommonHeroes.filter { it.color() == CardColor.RED })}")
        println("BLACK: ${medianScore(uncommonHeroes.filter { it.color() == CardColor.BLACK })}")
        println("GREEN: ${medianScore(uncommonHeroes.filter { it.color() == CardColor.GREEN })}")
        println("BLUE: ${medianScore(uncommonHeroes.filter { it.color() == CardColor.BLUE })}")
        println("ALL: ${medianScore(uncommonHeroes)}")

        println()
        println("---[MEDIAN COMMON HERO]---")
        val commonHeroes = allCards.filter { it.type() == CardType.HERO && it.rarity() == CardRarity.COMMON }
        println("RED: ${medianScore(commonHeroes.filter { it.color() == CardColor.RED })}")
        println("BLACK: ${medianScore(commonHeroes.filter { it.color() == CardColor.BLACK })}")
        println("GREEN: ${medianScore(commonHeroes.filter { it.color() == CardColor.GREEN })}")
        println("BLUE: ${medianScore(commonHeroes.filter { it.color() == CardColor.BLUE })}")
        println("ALL: ${medianScore(commonHeroes)}")

        val mainDeckTypes = listOf(CardType.IMPROVEMENT, CardType.CREEP, CardType.SPELL)

        println()
        println("---[ALL COLORS MAIN]---")
        val allMain = allCards.filter { mainDeckTypes.contains(it.type()) }
        // 0.878 main rare cards per pack
        val allMainRare = allMain.filter { it.rarity() == CardRarity.RARE }
        println("RARE 50%: ${medianScore(allMainRare)}")
        println("-----")
        // 2.423 main uncommon per pack
        val allMainUncommon = allMain.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 33.33%: ${medianScore(allMainUncommon, 33.33)}")
        println("UNCOMMON 66.66%: ${medianScore(allMainUncommon, 66.66)}")
        println("-----")
        // 5.700 main common per pack
        val allMainCommon = allMain.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 14.29%: ${medianScore(allMainCommon, 14.29)}")
        println("COMMON 28.57%: ${medianScore(allMainCommon, 28.57)}")
        println("COMMON 42.86%: ${medianScore(allMainCommon, 42.86)}")
        println("COMMON 57.14%: ${medianScore(allMainCommon, 57.14)}")
        println("COMMON 71.43%: ${medianScore(allMainCommon, 71.43)}")
        println("COMMON 85.71%: ${medianScore(allMainCommon, 85.71)}")

        println()
        println("---[RED MAIN]---")
        val redMain = allCards.filter { mainDeckTypes.contains(it.type()) && it.color() == CardColor.RED }
        val redMainRare = redMain.filter { it.rarity() == CardRarity.RARE }
        println("RARE 50%: ${medianScore(redMainRare)}")
        println("-----")
        val redMainUncommon = redMain.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 25%: ${medianScore(redMainUncommon, 25.0)}")
        println("UNCOMMON 50%: ${medianScore(redMainUncommon)}")
        println("UNCOMMON 75%: ${medianScore(redMainUncommon, 75.0)}")
        println("-----")
        // 28.5 common cards per 5 full pack -> 7.125 common each color. 100/(7.125 + 1) = 12.31%
        val redMainCommon = redMain.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 12.31%: ${medianScore(redMainCommon, 12.31)}")
        println("COMMON 24.62%: ${medianScore(redMainCommon, 24.62)}")
        println("COMMON 36.92%: ${medianScore(redMainCommon, 36.92)}")
        println("COMMON 49.23%: ${medianScore(redMainCommon, 49.23)}")
        println("COMMON 61.54%: ${medianScore(redMainCommon, 61.54)}")
        println("COMMON 73.85%: ${medianScore(redMainCommon, 73.85)}")
        println("COMMON 86.15%: ${medianScore(redMainCommon, 86.15)}")

        println()
        println("---[BLACK MAIN]---")
        val blackMain = allCards.filter { mainDeckTypes.contains(it.type()) && it.color() == CardColor.BLACK }
        val blackMainRare = blackMain.filter { it.rarity() == CardRarity.RARE }
        println("RARE 50%: ${medianScore(blackMainRare)}")
        println("-----")
        val blackMainUncommon = blackMain.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 25%: ${medianScore(blackMainUncommon, 25.0)}")
        println("UNCOMMON 50%: ${medianScore(blackMainUncommon)}")
        println("UNCOMMON 75%: ${medianScore(blackMainUncommon, 75.0)}")
        println("-----")
        // 28.5 common cards per 5 full pack -> 7.125 common each color. 100/(7.125 + 1) = 12.31%
        val blackMainCommon = blackMain.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 12.31%: ${medianScore(blackMainCommon, 12.31)}")
        println("COMMON 24.62%: ${medianScore(blackMainCommon, 24.62)}")
        println("COMMON 36.92%: ${medianScore(blackMainCommon, 36.92)}")
        println("COMMON 49.23%: ${medianScore(blackMainCommon, 49.23)}")
        println("COMMON 61.54%: ${medianScore(blackMainCommon, 61.54)}")
        println("COMMON 73.85%: ${medianScore(blackMainCommon, 73.85)}")
        println("COMMON 86.15%: ${medianScore(blackMainCommon, 86.15)}")

        println()
        println("---[GREEN MAIN]---")
        val greenMain = allCards.filter { mainDeckTypes.contains(it.type()) && it.color() == CardColor.GREEN }
        val greenMainRare = greenMain.filter { it.rarity() == CardRarity.RARE }
        println("RARE 50%: ${medianScore(greenMainRare)}")
        println("-----")
        val greenMainUncommon = greenMain.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 25%: ${medianScore(greenMainUncommon, 25.0)}")
        println("UNCOMMON 50%: ${medianScore(greenMainUncommon)}")
        println("UNCOMMON 75%: ${medianScore(greenMainUncommon, 75.0)}")
        println("-----")
        // 28.5 common cards per 5 full pack -> 7.125 common each color. 100/(7.125 + 1) = 12.31%
        val greenMainCommon = greenMain.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 12.31%: ${medianScore(greenMainCommon, 12.31)}")
        println("COMMON 24.62%: ${medianScore(greenMainCommon, 24.62)}")
        println("COMMON 36.92%: ${medianScore(greenMainCommon, 36.92)}")
        println("COMMON 49.23%: ${medianScore(greenMainCommon, 49.23)}")
        println("COMMON 61.54%: ${medianScore(greenMainCommon, 61.54)}")
        println("COMMON 73.85%: ${medianScore(greenMainCommon, 73.85)}")
        println("COMMON 86.15%: ${medianScore(greenMainCommon, 86.15)}")

        println()
        println("---[BLUE MAIN]---")
        val blueMain = allCards.filter { mainDeckTypes.contains(it.type()) && it.color() == CardColor.BLUE }
        val blueMainRare = blueMain.filter { it.rarity() == CardRarity.RARE }
        println("RARE 50%: ${medianScore(blueMainRare)}")
        println("-----")
        val blueMainUncommon = blueMain.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 25%: ${medianScore(blueMainUncommon, 25.0)}")
        println("UNCOMMON 50%: ${medianScore(blueMainUncommon)}")
        println("UNCOMMON 75%: ${medianScore(blueMainUncommon, 75.0)}")
        println("-----")
        // 28.5 common cards per 5 full pack -> 7.125 common each color. 100/(7.125 + 1) = 12.31%
        val blueMainCommon = blueMain.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 12.31%: ${medianScore(blueMainCommon, 12.31)}")
        println("COMMON 24.62%: ${medianScore(blueMainCommon, 24.62)}")
        println("COMMON 36.92%: ${medianScore(blueMainCommon, 36.92)}")
        println("COMMON 49.23%: ${medianScore(blueMainCommon, 49.23)}")
        println("COMMON 61.54%: ${medianScore(blueMainCommon, 61.54)}")
        println("COMMON 73.85%: ${medianScore(blueMainCommon, 73.85)}")
        println("COMMON 86.15%: ${medianScore(blueMainCommon, 86.15)}")

        println()
        println("---[ITEMS]---")
        val items = allCards.filter { it.type() == CardType.ITEM }
        println("RARE 50%: ${medianScore(items.filter { it.rarity() == CardRarity.RARE })}")
        println("-----")
        // 2.69 uncommon items per 5 full packs.
        val uncommonItems = items.filter { it.rarity() == CardRarity.UNCOMMON }
        println("UNCOMMON 25%: ${medianScore(uncommonItems, 25.0)}")
        println("UNCOMMON 50%: ${medianScore(uncommonItems)}")
        println("UNCOMMON 75%: ${medianScore(uncommonItems, 75.0)}")
        println("-----")
        // 6.33 common items per 5 full pack. 100/(6.33 + 1) = 13.64%
        val commonItems = items.filter { it.rarity() == CardRarity.COMMON }
        println("COMMON 13.64%: ${medianScore(uncommonItems, 13.64)}")
        println("COMMON 27.27%: ${medianScore(uncommonItems, 27.27)}")
        println("COMMON 40.91%: ${medianScore(uncommonItems, 40.91)}")
        println("COMMON 54.54%: ${medianScore(uncommonItems, 54.54)}")
        println("COMMON 68.18%: ${medianScore(uncommonItems, 68.18)}")
        println("COMMON 81.82%: ${medianScore(uncommonItems, 81.82)}")
    }

    fun medianScore(allCards: List<Card>, percentile: Double = 50.0) = "%.1f".format(allCards.map { it.baseScore() }.sorted().percentile(percentile))

    fun printColorRarity(allCards: List<Card>, color: String, cardColor: CardColor) {
        val colorCards = allCards.filter { it.color() == cardColor }
        val colorBasic = colorCards.filter { it.rarity() == CardRarity.BASIC }
        val colorCommon = colorCards.filter { it.rarity() == CardRarity.COMMON }
        val colorUncommon = colorCards.filter { it.rarity() == CardRarity.UNCOMMON }
        val colorRare = colorCards.filter { it.rarity() == CardRarity.RARE }
        println("$color cards: ${colorCards.count()}. Basic: ${colorBasic.count()}, Common: ${colorCommon.count()}, Uncommon: ${colorUncommon.count()}, Rare: ${colorRare.count()}")
    }

    fun printColorTypes(allCards: List<Card>, color: String, cardColor: CardColor) {
        val colorCards = allCards.filter { it.color() == cardColor }
        val colorHeroes = colorCards.filter { it.type() == CardType.HERO }
        val colorImprovements = colorCards.filter { it.type() == CardType.IMPROVEMENT }
        val colorSpells = colorCards.filter { it.type() == CardType.SPELL }
        val colorCreeps = colorCards.filter { it.type() == CardType.CREEP }
        println("$color cards: ${colorCards.count()}. Heroes: ${colorHeroes.count()}, Improvements: ${colorImprovements.count()}, Spells: ${colorSpells.count()}, Creeps: ${colorCreeps.count()}")
    }
}