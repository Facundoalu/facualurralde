package com.alumaster.androidalu

fun main() {
    var nombre: String = "Facu"
//Indice de 0 - 6 // Tamaño "7"
    val diasSemana =
        arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
//Tamaño
    println(diasSemana.size)
    if (diasSemana.size > 8) {
        println(diasSemana[7])
    } else {
        println("No hay mas valores en el array")
    }

//Modificar valores
    diasSemana[2] = "Holitas"
    println(diasSemana)

//Bucles para array
    for (position in diasSemana.indices) {     //Solo numero
        println(diasSemana[position])
    }
    for ((position, value) in diasSemana.withIndex()) {         //Ambas
        println("La posicion es $position y el valor es $value")
    }
    for (facundo in diasSemana) {               //Solo nombre
        println("ahora es $facundo")
    }
}


