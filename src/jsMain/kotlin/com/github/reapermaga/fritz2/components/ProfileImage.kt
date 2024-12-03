package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.alt
import dev.fritz2.core.src

fun RenderContext.profileImage() {
    img("w-72 h-auto rounded-xl transition border-2 border-background-200 hover:border-background-50 shadow-xl") {
        src("https://avatars.githubusercontent.com/u/25954039?v=4")
        alt("My profile")
    }
}