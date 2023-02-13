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

fun maxBy(a : Int , b : Int) : Int {
    if(a>b){
       return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b: Int) = if(a>b) a else b
//코틀린의 모든 함수는 Expression
fun checkNum(score : Int) : Unit{
    when (score) { //스위치 Statement
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")// 복수 가능
        else -> println(" I don1t know")
    }
    var b = when(score){ // 리턴값으로도 사용 가능 Expression
        1 -> 1
        2 -> 2
        else -> 3
    }
    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}
// Expression vs Statement
// Expression 뭘 만들어서 값을 반환하는 것
// Statement 어떤 것을 명령을 하라고 지시하는 문장 같은 것