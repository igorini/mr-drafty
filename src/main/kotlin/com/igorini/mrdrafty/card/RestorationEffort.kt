package com.igorini.mrdrafty.card

/** Represents a card "Restoration Effort" */
class RestorationEffort : Card() {
    override fun name() = "Restoration Effort"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 35.0
}