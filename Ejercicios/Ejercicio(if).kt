package com.alumaster.androidalu

fun main(){
    val morningNotification = 5
    val eveningNotification = 135
        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)

}

fun printNotificationSummary(numberOfMessages:Int) {
    if (numberOfMessages > 99) {
        println("Tenes mas de 99 mensajes mogolico")
    } else {
        println("Tenes $numberOfMessages mensajes")

    }
}