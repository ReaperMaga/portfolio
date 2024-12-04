package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext

fun RenderContext.logo() {
    h1("text-xl md:text-3xl font-bold uppercase cursor-pointer flex") {
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