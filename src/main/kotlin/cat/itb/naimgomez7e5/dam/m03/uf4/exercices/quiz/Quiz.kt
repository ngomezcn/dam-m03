package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.quiz

import java.util.*

abstract class Question() {
    abstract val question:String;
    abstract val answer:String;
    abstract fun isCorrectAnswer(userAnswer: String) : Boolean;
    abstract fun printQuestion()
}

class FreeTextQuestion(override val question: String, override val answer: String) : Question(){
    override fun isCorrectAnswer(userAnswer: String): Boolean {
        if(userAnswer == answer) {
            return true;
        }
        return false;
    }

    override fun printQuestion() {
        println(question)
    }
}

class MultipleChoiseQuestion(override val question: String, override val answer: String, val choices: List<String>): Question(){
    override fun isCorrectAnswer(userAnswer: String): Boolean {
        if(userAnswer == answer) {
            return true;
        }
        return false;
    }

    override fun printQuestion() {
        println(question)
        println(" Opciones:")
        for (choice in choices) {
            println(" - $choice")
        }
    }
}

class Quiz(val scan: Scanner) {
    var correctCounter = 0;
    val questions = listOf<Question>(
        FreeTextQuestion("¿Por qué no hay comida de gato con sabor a ratón?", "no se"),
        FreeTextQuestion("¿Quién inventó el telescopio?", "ni idea bro"),
        FreeTextQuestion("¿Cuántos satélites tenemos orbitando alrededor de la tierra?", "1419"),
        MultipleChoiseQuestion("¿Ciudad más poblada mundo?", "Barcelona", listOf("Barcelona", "Tu sabras", "Yo que se", "Pato")),
        MultipleChoiseQuestion("¿Qué cantidad de huesos en el cuerpo humano?", "muchos", listOf("1", "0", "muchos", "-13123")));

    fun start() {

        for (i in questions.indices) {
            val question = questions[i];
            print("$i: "); question.printQuestion();
            if(question.isCorrectAnswer(scan.nextLine())) {
                correctCounter++;
            }
        }

        println("Respostes correctes: $correctCounter")
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val quiz = Quiz(scan);
    quiz.start()
}