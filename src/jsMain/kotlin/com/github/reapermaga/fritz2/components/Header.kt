package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext

fun RenderContext.header() {
    header("") {
        h1("text-2xl") {
            +"Fritz2"
        }
    }
}