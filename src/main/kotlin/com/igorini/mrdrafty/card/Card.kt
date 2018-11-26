package com.igorini.mrdrafty.card

/** Represents an abstract card */
abstract open class Card {
    open var score = baseScore()

    abstract fun name(): String
    abstract fun imageUrl(): String
    abstract fun color(): CardColor
    abstract fun type(): CardType
    abstract fun rarity(): CardRarity
    abstract fun baseScore(): Double

    override fun toString() = name()
    //override fun toString() = "${name()} [base = ${baseScore()}, current = $score]"
}