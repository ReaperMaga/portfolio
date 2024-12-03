package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.joinClasses
import dev.fritz2.core.storeOf
import dev.fritz2.core.transition
import dev.fritz2.core.waitForAnimation
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

fun RenderContext.initializeScreen() {
    val store = storeOf(false)
    div {
        transition(
            enter = "transition delay-[3000ms] duration-500",
            enterStart = "opacity-100 blur-none",
            enterEnd = "opacity-0 blur-lg",
            leave = "transition duration-500",
            leaveStart = "opacity-0 blur-lg",
            leaveEnd = "opacity-100 blur-none",
        )
        className(store.data.onEach { waitForAnimation() }.map { if(it) "" else "hidden" }, "w-screen h-screen loader-background flex items-center justify-center absolute z-20",
        )
        div("loader") {
            div("loader-inner") {
                for (i in 1..8) {
                    div("loader-block") {}
                }
            }

        }
    }
}