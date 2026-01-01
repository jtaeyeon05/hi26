package io.github.jtaeyeon05.hi26

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
