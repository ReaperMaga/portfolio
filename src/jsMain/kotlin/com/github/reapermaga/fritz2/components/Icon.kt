package com.github.reapermaga.fritz2.components

import dev.fritz2.core.RenderContext
import dev.fritz2.core.href
import dev.fritz2.core.target

fun RenderContext.icon(icon: String, classes: String = "") {
    custom("iconify-icon") {
        attr("icon", icon)
        attr("class", classes)
    }
}

fun RenderContext.socialIcon(icon: String, iconClasses: String = "", href: String) {
    a {
        href(href)
        target("_blank")
        icon(icon, iconClasses)
    }
}

fun RenderContext.githubIcon() {
    socialIcon(
        "ph:github-logo-fill",
        iconClasses = "text-xl bg-slate-600 p-2 rounded-full opacity-80 hover:opacity-100",
        href = "https://github.com/reapermaga")
}