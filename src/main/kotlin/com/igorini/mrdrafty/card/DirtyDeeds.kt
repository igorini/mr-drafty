package com.igorini.mrdrafty.card

/** Represents a card "Dirty Deeds" */
class DirtyDeeds : Card() {
    override fun name() = "Dirty Deeds"
    override fun imageUrl() = ""
    override fun color() = CardColor.BLACK
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.UNCOMMON
    override fun baseScore() = 60.0
}