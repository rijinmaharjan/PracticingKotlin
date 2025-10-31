package com.example.functiondeclare

fun main() {
    print("Hello World1")
    println("Hello World2")

//to declare variable in kotlin
    var name: String = "Rijin"   //this value can be changed (Mutable)

    val age: Int = 20   //This value cannot be changed (immutable)
    val terms: Boolean = false
    val weight: Double = 0.0
    name = "Ram"

//    age=20 cannot change


    println("My name is " + name + " and age is " + age + "and weight is " + weight)

    println("My name is ${name.uppercase()} and age is $age and weight is $weight") //use this and we use curly braces to access properties of variable

//Array
    val size = arrayOf(10, 20, 30)
    size[2] = 50
    println(size[2])


//arrayList
    val Size1 = ArrayList<Int>() //Values cannot be assigned in this
    val Size2 = arrayListOf<Int>(10, 20, 30) //values can be assigned in this

//for loop
    for (i in 0..10) {
        print(i)
    }
    for (i in 0 until 10) {
        print(i)
    }
}