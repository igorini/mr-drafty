package com.igorini.mrdrafty.card

/** Represents a card "Blade of the Vigil" */
class BladeOfTheVigil : Card() {
    override fun name() = "Blade of the Vigil"
    override fun imageUrl() = ""
    override fun color() = CardColor.NONE
    override fun type() = CardType.ITEM
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 80.2
}