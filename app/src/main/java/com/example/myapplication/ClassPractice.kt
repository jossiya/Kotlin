package com.example.myapplication

//class Human constructor(name : String){ // constructor 사용 방법
//
//
//    val name =name
//
//    fun eatingCake(){
//        println("This is so YUMMMY!")
//    }
//}
 open class Human(val name : String ="jogillra"){ // 파라미터로 선언 가능 하고 상속 할려면 open 붙여야함
    constructor(name : String,age : Int): this(name){ //constructor 선언 방법
        println("My name is ${name}, ${age}years old")
    }

    init {//클레스 실행시 기본 실행되는 매서드
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("This is so YUMMMY!")
    }
    open fun singASong(){//오버라이딩 하기위해 오픈
        println("lalala")
    }
}

class Korean : Human(){// 상속은 자바랑 같은 하나만 가능
    override fun singASong(){
        super.singASong()// 자바랑 같음
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
    val korean= Korean(); //자바랑 다르게 new 연산자 사용 할 필요가 없다.
    korean.singASong()
}