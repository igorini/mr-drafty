package com.igorini.mrdrafty.card

/** Represents a card "Strafing Run" */
class StrafingRun : Card() {
    override fun name() = "Strafing Run"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLUE
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 83.8
}