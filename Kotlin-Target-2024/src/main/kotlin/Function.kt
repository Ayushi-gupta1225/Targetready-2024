package org.example

// File: Example.kt



class Example {
    public val publicVariable = 10
    private val privateVariable = 20
    protected val protectedVariable = 30
    internal val internalVariable = 40

    fun test() {
        println(publicVariable) // Accessible
        println(privateVariable) // Accessible within the same file
        println(protectedVariable) // Accessible within the same class and subclasses
        println(internalVariable) // Accessible within the same module
    }
}

fun main() {
    val obj = Example()
    println(obj.publicVariable) // Accessible
    // println(obj.privateVariable) // Error: Cannot access 'privateVariable': it is private in 'Example'
    // println(obj.protectedVariable) // Error: Cannot access 'protectedVariable': it is protected in 'Example'
    println(obj.internalVariable) // Accessible within the same module
}