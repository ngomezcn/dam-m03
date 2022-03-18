package cat.itb.naimgomez7e5.dam.m03.uf1.data.project

import java.time.Year
import java.util.*

val scanner: Scanner = Scanner(System.`in`).useLocale(Locale.UK)
fun main() {
    welcome("TrainingAssistant") // change it as you need
    ageCalculator()
    imcCalculator()
    trainingSchedule()
}

fun welcome(assistantName: String) {
    println("Hello! My name is $assistantName. Please, tell me your name.")
    println("What a great name you have, " + scanner.nextLine())
}

fun ageCalculator() {
    println()
    val age = (Year.now().value) - scanner.nextInt()
    println("You are between " + age + " - " + (age+1) + " years old. That's a good age for practicing sport.")
}

fun imcCalculator() {


    println("Let's check some of your parameters")

    println("Tell me your weight in kg")
    val weight : Float = scanner.nextFloat()
    println("Tell me your height in m")
    val height : Float = scanner.nextFloat()

    val imc : Float = weight / ((height)*(height))
    println("Your IMC is $imc")

    println("Checking insufficient weight.... " + if (imc < 18.5) "true" else "false")
    println("Checking normal weight.... " + if (imc >= 18.5 && imc < 25) "true" else "false")
    println("Checking overweight.... " + if (imc >= 25 && imc < 50) "true" else "false")
    println("Checking obesity.... " + if (imc >= 50) "true" else "false")

}

fun trainingSchedule() {

    println("I'll tell you your training plan.\n" +
            "I'll tell you your training plan.\n" +
            "How many hours would you like to train?")
    val hours : Int = scanner.nextInt()

    println("How many days can you train?")
    val days : Int = scanner.nextInt()

    println("Your routine sport could be:")

    //var hours = 9
    //var days = 3

    val dResult1 = hours%days
    val dResult2 = days-dResult1

    var hResult1 = hours/days
    hResult1 += 1

    val hResult2 = hours/days

    if(hResult1 > hResult2)
    {
        println("$dResult1 days $hResult1 hours")
        println("$dResult2 days $hResult2 hours")
    }else
    {
        println("$dResult2 days $hResult2 hours")
        println("$dResult1 days $hResult1 hours")
    }
}
