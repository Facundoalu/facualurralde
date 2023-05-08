package com.alumaster.androidalu

//Variables universales
    val edad : Int = 27
    var edad2 : Int = 50
fun main (){
    showMyName()
    variablesNumericas()
    stringConcatenada()
     }
fun stringConcatenada(){

    //Char
        val charEx : Char = '2'
        val charEx2 : Char = 'y'
    //String

        val stringEj : String = "Facu alu"
        val stringEj2 : String = "alu2"

    //Boolean
        val booleanEjemplo : Boolean = true



    /*var ejemploSuma = edad+floatExample
        println (ejemploSuma)
        */

        //String concatenada
        var stringConcatenada : String = "Hola"
                stringConcatenada = ("Hola me llamo $stringEj y mi edad es $edad")
        println(stringConcatenada)


}
fun variablesNumericas(){


    //Int
    println (edad2) //Readme Secuencial
    edad2 = 10
    println (edad2) //Nuevo valor
    //Long
    val numerolargo : Long = 9999999999
    //Float
    val floatExample : Float = 15.7f
    //Double
    val DoubleEx : Double = 16.27346
    //Variables
      //Operaciones Con Variables

    println("Sumar:")
    println (edad + edad2)

    println("Restar:")
    println (edad - edad2)

    println("Multiplicar:")
    println (edad * edad2)

    println("Dividir:")
    println (edad / edad2)

}
fun showMyName (){
    println("facundito")
}