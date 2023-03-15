package com.example.androidfirst

fun main() {
    var obj = Super1()
    obj.publicData++
//    obj.protectedData ++
//    obj.privateData ++
}

open class Super1 constructor(){
    var publicData =10
    protected var protectedData = 20
    private var privateDate = 30
}

class Sub constructor() : Super1(){
    fun subFun(){
        publicData ++
        protectedData ++
//        privateData ++
    }
}