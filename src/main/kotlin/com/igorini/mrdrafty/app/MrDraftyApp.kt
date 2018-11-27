package com.igorini.mrdrafty.app

import com.igorini.mrdrafty.app.css.MainCss
import com.igorini.mrdrafty.app.view.CardPick
import tornadofx.*

/** Represents a Mr Drafty app */
class MrDraftyApp : App(CardPick::class, MainCss::class)
