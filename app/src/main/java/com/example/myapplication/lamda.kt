package com.example.myapplication

//1. Lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
//1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int)
//2) return 값으로 사용할 수가 있다.

//람다의 기본 정의
//val lamdaName : Type ={argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}
val squares  = {number : Int -> number*number}

val nameAge ={name : String, age : Int ->
    "my name is ${name} I`m ${age}"
}

fun main(){
    println(square(12))
    println(nameAge("jossi", 32))
    val a = "jossi said "
    val b = "simssi said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("jossi",32))
    println(calculateGrade(98))
    println(calculateGrade(984))
}

//확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String{
    val introduceMyself : String.(Int) ->String={"I am ${this} and ${it} years old"}
    return  name.introduceMyself(age)
}

//람다의 Return
val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else ->"Error"
    }
}