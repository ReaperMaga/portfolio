package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext

fun RenderContext.logo() {
    h1("text-3xl font-bold uppercase cursor-pointer flex") {
        span {
            +"Reape"
        }
        div("text-primary rotate-180") {
            +"r"
        }
        span {
            +"Maga"
        }
    }
}