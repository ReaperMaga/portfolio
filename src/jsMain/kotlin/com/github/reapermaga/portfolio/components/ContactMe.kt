package com.github.reapermaga.portfolio.components

import dev.fritz2.core.*
import kotlinx.browser.document
import org.w3c.dom.HTMLFormElement
import kotlin.js.Promise

fun RenderContext.contactMe() {
    val loading = storeOf(false)
    val sentMessage = storeOf(false)
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

        form("my-6 flex flex-col gap-4 w-full md:w-11/12 xl:w-7/12") {
            id("contact-form")
            contactMeInput("Your name", name = "name")
            contactMeInput("Your email", type = "email", name = "email")
            contactMeTextArea("Message")
            div("flex items-center gap-3") {
                customButton("Send", ButtonType.SECONDARY, classes = "w-max", children = {
                    loading.data.render {
                        if (it) {
                            icon("svg-spinners:180-ring")
                            disabled(true)
                        } else {
                            disabled(false)
                        }
                    }
                }, onClick = { event ->
                    if (loading.current) {
                        return@customButton
                    }
                    event.preventDefault()
                    loading.update(true)
                    val formNode = document.getElementById("contact-form") as HTMLFormElement
                    sendEmail(formNode).then {
                            sentMessage.update(true)
                        }.finally {
                            loading.update(false)
                        }
                    formNode.reset()
                })
                sentMessage.data.render {
                    if (it) {
                        span("text-md text-lime-500") {
                            +"You successfully sent the message."
                        }
                    }
                }
            }


        }
    }
}

external fun sendEmail(data : HTMLFormElement) : Promise<Any>

fun RenderContext.contactMeInput(
    placeholder : String,
    type : String = "text",
    classes : String = "",
    name : String = ""
) {
    input(joinClasses("w-full sm:w-1/2 px-3 py-2 rounded bg-background-400 shadow-xl glass", classes)) {
        type(type)
        name(name)
        placeholder(placeholder)
    }
}

fun RenderContext.contactMeTextArea(placeholder : String) {
    textarea(joinClasses("w-full px-3 py-2 rounded bg-background-400/80 shadow-xl glass min-h-48")) {
        name("message")
        placeholder(placeholder)
    }
}