package org.example.kotlinoop.model


class Person {
    var name: String =" "// may cause kotlin.UninitializedPropertyAccessException
    var city: String = ""
    var age:Int = 0

    override fun toString(): String {
        return "Person(name='$name', city='$city', age=$age)"
    }

}