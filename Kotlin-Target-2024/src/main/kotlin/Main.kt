package org.example

fun main() {
    println("Hello World! hi there")

    //The when expression is Kotlin's replacement for the
    // traditional switch statement in Java.  It allows you to check
    // a value against multiple cases and execute corresponding code blocks.

    val dayOfWeek = 3

    when (dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
    //5. when with Multiple Values:
    val x = 5

    when (x) {
        1, 2, 3 -> println("x is between 1 and 3")
        4, 5, 6 -> println("x is between 4 and 6")
        else -> println("x is not between 1 and 6")
    }
    //when with Conditions:
    val y = 10

    when {
        y < 0 -> println("x is negative")
        y == 0 -> println("x is zero")
        y > 0 -> println("x is positive")
    }

//    7. when as an Expression:
//    when can also be used as an expression, allowing you to assign its result to a variable.

    val dayOfweek = 3
    val dayName = when (dayOfweek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("Today is $dayName")
}