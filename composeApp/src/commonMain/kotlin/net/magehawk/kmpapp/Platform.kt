package net.magehawk.kmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform