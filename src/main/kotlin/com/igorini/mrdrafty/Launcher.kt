package com.igorini.mrdrafty

import com.igorini.mrdrafty.app.MrDraftyApp
import com.igorini.mrdrafty.bot.CardStats
import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext
import tornadofx.*

val mainModule = module {
    single { MrDrafty() }
    single { CardStats() }
}

fun main(args: Array<String>) {
    StandAloneContext.startKoin(listOf(mainModule))
    init()
    launch<MrDraftyApp>(args)
}

fun init() {
    CardStats().printMedianCards()
}