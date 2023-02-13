package com.example.myapplication

fun main(){
    helloWorld();
    println(add(1,2));

    //3. String Template
    val name = "jossi";
    val lastName = "jo"
    println("My name is ${name + lastName}  I`m 32")
    println("this is 2\$") // 달러 표시를 쓰고 싶을 경우 백슬레시 사용
}
//1.함수

fun helloWorld() : Unit {
    println("Hello World!!")
}

fun add(a : Int , b : Int) : Int {
    return a+b;
}

//val vs var
//val = value 상수 - 변하지 않는 값
//var = variable 변수 - 변하는 값

fun hi(){
    val a : Int = 10;
    var b : Int = 9;
    var g : String // 값을 초기화 하지 않았으면 타입을 지정해줘야 한다.
//    a=100 안됨
//    b=100 됨
    val c = 100 //타입 안써도 됨
    var d = 100 //타입 안써도 됨

    var name : String = "jossi"// 이것도 타입 안써도 됨됨
}

// 4. 조건식
