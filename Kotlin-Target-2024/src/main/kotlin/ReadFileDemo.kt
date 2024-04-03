package org.example

import java.io.File

fun main() {
    print("enter file to read: ")
    val filename = readln()
    val file = File(filename)

    if (!file.exists()) {
        println("$filename doesn't exist")
        return
    }

//    val lines = file.readLines()
//    lines.forEach { println(it) }

    val content = file.readText()
    println(content)

    val bytes = file.readBytes() // generally meant for binary files like images/videos/etc
    val contents = String(bytes)
    println(content)
}