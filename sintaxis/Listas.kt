package com.alumaster.androidalu

fun main(){
    //listaInmutable()

}
/*fun listaInmutable(){
    val soloLeer : List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        // println(soloLeer.size)
        //println(soloLeer)
        //println(soloLeer[2])
        //println(soloLeer.last())
        //println(soloLeer.first())
    //Filtrar
  //  val ejemplo = soloLeer.filter {it.contains("a")}
 //       println(ejemplo)
    soloLeer.forEach {diasSemana -> println(diasSemana)}

}*/
fun mutableList(){
    var diasSemana2: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    diasSemana2.add("Facuday") //Ultima posicion
    diasSemana2.add(index = 2,"Facuday") //donde quiera
        println(diasSemana2)
    if (diasSemana2.isNotEmpty()){              //si la lista no esta vacia, recorre
        diasSemana2.forEach{println(it)}
    }



}
