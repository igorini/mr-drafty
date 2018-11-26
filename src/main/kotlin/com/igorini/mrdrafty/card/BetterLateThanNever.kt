package com.igorini.mrdrafty.card

/** Represents a card "Better Late Than Never" */
class BetterLateThanNever : Card() {
    override fun name() = "Better Late Than Never"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 86.5
}