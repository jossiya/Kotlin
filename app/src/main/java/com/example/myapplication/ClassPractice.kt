package com.example.myapplication

//class Human constructor(name : String){
//
//
//    val name =name
//
//    fun eatingCake(){
//        println("This is so YUMMMY!")
//    }
//}
 open class Human(val name : String ="jogillra"){
    constructor(name : String,age : Int): this(name){
        println("My name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("This is so YUMMMY!")
    }
    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("랄랄라")
        println("my name is : ${name}")
    }
}

fun main(){
//    val human = Human("jossi")
//    human.eatingCake()
//
//    val mom =Human("hohoya" , 56)
//    println("this human`s is ${human.name}")
    val korean= Korean();
    korean.singASong()
}