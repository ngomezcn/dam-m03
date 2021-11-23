import java.util.*
import kotlin.math.max

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)
fun main() {
    // Use only this scanner
    val scanner = Scanner(System.`in`)
    // Your code

    println("Vols jugar en mode 1vs1 (1) o solitari (2)?")

    // Game settings
    val gameMode : Int = scanner.nextInt();
    val maxAttempts = 12;
    val versus = 1;
    val solo = 2;

    // Logic
    var secretString : String = "";
    var guess = "";
    var checkMatch : Evaluation;

    // Choose game mode and fill secretString
    if(gameMode == versus)
    {
        println("Introdueix la paraula secreta: ");
        secretString = scanner.next();
    }
    if(gameMode == solo)
    {
        for (i in 0..4)
        {
            secretString += randomChar().toString();
        }
    }

    // Game starts
    for (i in 0 until maxAttempts)
    {
        println("Introdueix una cominació: ")
        guess = scanner.next()
        checkMatch = evaluateWord(secretString, guess)
        if(checkMatch.rightPosition == 4)
        {
            println("Enhorabona! has guanyat")
            break // If win, exit for and finish program.
        }
        println("Right position: ${checkMatch.rightPosition}, wrong position: ${checkMatch.wrongPosition}")
    }

    //use this function
    var evaluation = evaluateWord("ABCD", "AEEE")
}
fun randomChar():Char{
    val allowedChars = 'A'..'F'
    return allowedChars.random()
}

fun evaluateWord(secret: String, guess: String): Evaluation {
    var rightPosition : Int = 0;
    var wrongPosition : Int = 0;

    for (i in 0 until 4)
    {

    }

    //Calculate your right and wrong positions and change it as you need
    return Evaluation(rightPosition,wrongPosition)
}