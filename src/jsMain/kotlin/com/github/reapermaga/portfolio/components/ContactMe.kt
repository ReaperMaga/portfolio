package com.github.reapermaga.portfolio.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.joinClasses
import dev.fritz2.core.placeholder
import dev.fritz2.core.type

fun RenderContext.contactMe() {
    div("mt-28 flex flex-col") {
        h1("text-4xl font-bold") {
            +"Contact"
            span("text-primary") {
                +" me"
            }
        }
        p {
            +"If you have any questions or want to work together, feel free to contact me. I will try to respond as soon as possible."
        }

        form("my-6 flex flex-col gap-4 w-7/12") {
            contactMeInput("Your name")
            contactMeInput("Your email", type = "email")
            contactMeTextArea("Message")
            customButton("Send", ButtonType.SECONDARY, classes = "w-max")
        }
    }
}

fun RenderContext.contactMeInput(placeholder: String, type: String = "text", classes: String = "") {
    input(joinClasses("w-1/2 px-3 py-2 rounded bg-background-400 shadow-xl glass", classes)) {
        type(type)
        placeholder(placeholder)
    }
}

fun RenderContext.contactMeTextArea(placeholder: String) {
    textarea(joinClasses("w-full px-3 py-2 rounded bg-background-400/80 shadow-xl glass min-h-48")) {
        placeholder(placeholder)
    }
}