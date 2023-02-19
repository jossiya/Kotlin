package com.example.myapplication

class Book private constructor(val id :Int, val name : String){
    companion object BookFactory : IdProvider{
        val myBook = "new book"
        fun create()=Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }
}
//Companion 자바의 스테틱 역활
interface  IdProvider{
    fun getId() : Int
}
fun main(){
    val book =Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}