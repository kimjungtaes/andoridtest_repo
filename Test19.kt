package com.example.androidfirst

fun main() {
    val returnValue = ramdaFunc(calBoolean)
    println(returnValue())
}

val calBoolean = { no: Int ->
    println("no = ${no}")
    no > 10
}

fun ramdaFunc(arg: (Int) -> Boolean):()-> String {
    println(arg(5))

    return { -> val value = "길동"; "return Value ${value}" }
}

//fun calBoolean(no: Int):Boolean{
//    println("no = ${no}")
//    return no > 10
//}
//
