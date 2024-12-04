package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext

fun RenderContext.footer() {
    footer("mt-28 h-16 flex items-center bg-background-400") {
        div("w-8/12 mx-auto px-10 flex justify-end items-center") {
            h3("text-sm text-gray-300/70 italic") {
                +"ReaperMaga - Full Stack Developer"
            }
        }
    }
}