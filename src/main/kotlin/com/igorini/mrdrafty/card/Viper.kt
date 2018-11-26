package com.igorini.mrdrafty.card

/** Represents a card "Viper" */
class Viper : Card() {
    override fun name() = "Viper"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.HERO
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 80.4
}