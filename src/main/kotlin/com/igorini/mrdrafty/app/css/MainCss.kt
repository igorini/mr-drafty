package com.igorini.mrdrafty.app.css

import javafx.scene.text.FontWeight
import tornadofx.*

/** Represents a main stylesheet */
class MainCss : Stylesheet() {
    init {
        label {
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            backgroundColor += c("#cecece")
        }
    }
}