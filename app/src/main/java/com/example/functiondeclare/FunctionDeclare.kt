package com.example.functiondeclare

fun main() {
//    val result = calculate(10, 200)
//    print(result)
    val input : String = readln().lowercase()
    CalculateMarks(input)


}
fun calculate (a:Int, b:Int) : Int { // Int is return type
    return a+b
}
fun login (username:String, password:String) : Unit{ //Unit is void return type

}

fun CalculateMarks(a:String) {
    val studentMarks = mutableMapOf(
        "ram" to 20,
        "shyam" to 30,
        "sita" to 40,
     )
    studentMarks["ram"]= 100
    studentMarks.put("shyam", 20)
    println(studentMarks[a])
}