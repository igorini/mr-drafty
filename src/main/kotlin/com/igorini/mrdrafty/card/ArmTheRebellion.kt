package com.igorini.mrdrafty.card

/** Represents a card "Arm the Rebellion" */
class ArmTheRebellion : Card() {
    override fun name() = "Arm the Rebellion"
    override fun imageUrl() = ""
    override fun color() = CardColor.GREEN
    override fun type() = CardType.SPELL
    override fun rarity() = CardRarity.COMMON
    override fun baseScore() = 106.4
}