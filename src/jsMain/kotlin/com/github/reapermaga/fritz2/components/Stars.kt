package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext


fun RenderContext.stars() {
    div("stars") {
        for (i in 1..16) {
            div("star") {}
        }
    }

}