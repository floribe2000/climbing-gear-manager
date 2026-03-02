package com.floribe2000.climbinggear

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Climbing Gear Manager",
    ) {
        App()
    }
}
