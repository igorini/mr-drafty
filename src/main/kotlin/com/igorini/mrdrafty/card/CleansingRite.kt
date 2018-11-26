package com.igorini.mrdrafty.card

/** Represents a card "Cleansing Rite" */
class CleansingRite : Card() {
    override fun name() = "Cleansing Rite"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 48.0
}