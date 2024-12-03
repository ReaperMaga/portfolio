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