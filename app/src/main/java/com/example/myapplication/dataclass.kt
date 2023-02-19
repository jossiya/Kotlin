package com.example.myapplication

data class Ticket(val companyName : String , val name : String , var date : String, var seatNumber : Int)
class TicketNormal(val companyName : String , val name : String , var date : String, var seatNumber : Int)

//toString() , hashCode(), equals() , copy()

fun main(){
    val ticketA=Ticket("koreanAir", "jossi" , "2023-02-19",14)
    val ticketB=TicketNormal("koreanAir", "jossi" , "2023-02-19",14)
    println(ticketA)
    println(ticketB)
}