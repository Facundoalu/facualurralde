package com.alumaster.androidalu

fun main(){
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

        println("El precio para un niño de $child es \$${ticketPrice(child,isMonday)}")
        println("El precio para un adulto de $adult es \$${ticketPrice(adult,isMonday)}")
        println("El precio para un senior de $senior es \$${ticketPrice(senior,isMonday)}")
}
fun ticketPrice(age: Int, isMonday: Boolean) :Int {
    return when(age){
      in 0..12 -> 15
      in 13..60-> if (isMonday) 25 else 30
      in 61..99-> 20
        else -> -1

    }

}



