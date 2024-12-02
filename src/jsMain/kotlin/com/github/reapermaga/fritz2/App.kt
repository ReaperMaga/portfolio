package com.github.reapermaga.fritz2

import com.github.reapermaga.fritz2.components.customButton
import com.github.reapermaga.fritz2.components.header
import dev.fritz2.core.Store
import dev.fritz2.core.render
import dev.fritz2.core.storeOf
import dev.fritz2.core.transition


fun main() {
    render {
        val testStore: Store<Boolean> = storeOf(false)
        div("w-screen min-h-screen bg-background flex flex-col items-center justify-center inter-500 text-gray-300") {
            header()
            customButton("Toggle", onClick = {
                testStore.update(!testStore.current)
                println("${testStore.current}")
            })
            h1 {
                testStore.data.renderText()
            }
            div("h-28 bg-red-500 w-1/2") {
                transition(
                    testStore.data,
                    enter = "transition duration-100 ease-out",
                    enterStart = "translate-x-0",
                    enterEnd = "translate-x-10",
                    leave = "transition duration-100 ease-in",
                    leaveStart = "translate-x-10",
                    leaveEnd = "translate-x-0"
                )
            }


        }
    }
}