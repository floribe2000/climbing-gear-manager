package com.floribe2000.climbinggear

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
