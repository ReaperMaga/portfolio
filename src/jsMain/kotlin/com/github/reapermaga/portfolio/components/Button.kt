package com.github.reapermaga.portfolio.components

import dev.fritz2.core.HtmlTag
import dev.fritz2.core.RenderContext
import dev.fritz2.core.disabled
import dev.fritz2.core.joinClasses
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.events.MouseEvent

enum class ButtonType(val classes: String) {
    PRIMARY("bg-gradient-to-r from-primary to-primary-600 hover:opacity-90"),
    SECONDARY("bg-gradient-to-r from-secondary to-secondary-600 hover:opacity-90")
}

fun RenderContext.customButton(text: String, type : ButtonType = ButtonType.PRIMARY, onClick: (event: MouseEvent) -> Unit = {}, classes: String = "", children: HtmlTag<HTMLButtonElement>.() -> Unit = {}) {
    button(joinClasses(type.classes, "transition text-white py-2 px-4 pr-5 rounded flex items-center gap-2 disabled:opacity-50", classes)) {
        inlineStyle("box-shadow: inset 0.4px 1px 4px hsla(0, 0%, 50%, 0.8);")
        children()
        +text
        clicks handledBy {
            onClick(it)
        }
    }
}