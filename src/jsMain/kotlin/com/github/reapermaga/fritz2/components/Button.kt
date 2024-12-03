package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.joinClasses

enum class ButtonType(val classes: String) {
    PRIMARY("bg-gradient-to-r from-primary to-primary-600 hover:opacity-90"),
    SECONDARY("bg-gradient-to-r from-secondary to-secondary-600 hover:opacity-90")
}

fun RenderContext.customButton(text: String, type : ButtonType = ButtonType.PRIMARY, onClick: () -> Unit = {}) {
    button(joinClasses(type.classes, "transition text-white py-2 px-4 pr-5 rounded")) {
        inlineStyle("box-shadow: inset 0.4px 1px 4px hsla(0, 0%, 50%, 0.8);")
        +text
        clicks handledBy {
            onClick()
        }
    }
}