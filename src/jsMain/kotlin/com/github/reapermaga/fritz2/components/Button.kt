package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.joinClasses

enum class ButtonType(val classes: String) {
    PRIMARY("bg-primary hover:bg-primary/60"),
    SECONDARY("bg-secondary hover:bg-secondary/60")
}

fun RenderContext.customButton(text: String, type : ButtonType = ButtonType.PRIMARY, onClick: () -> Unit = {}) {
    button(joinClasses(type.classes, "transition text-white py-2 px-4 rounded")) {
        +text
        clicks handledBy {
            onClick()
        }
    }
}