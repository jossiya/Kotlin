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
}