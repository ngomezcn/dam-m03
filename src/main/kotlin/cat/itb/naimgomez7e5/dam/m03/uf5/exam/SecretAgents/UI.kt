package cat.itb.naimgomez7e5.dam.m03.uf5.exam.SecretAgents

import java.lang.System.exit
import java.util.*

data class Agent(val name: String, val surname: String)

// String that contains the abecedary of the alphabet

class Alias() {
    lateinit var alias : String;

    init {
        alias = generateAlias()
    }

    private fun generateAlias(): String {
        val mayus = "abcdefghijklmnopqrstuvwxyz"
        val numbers = "0123456789"

        var toAlias = ""
        val length = (3..8).random()

        toAlias += mayus.random().uppercaseChar()

        repeat(length-1) {
            toAlias += mayus.random()
        }
        toAlias += numbers.random()

        return toAlias
    }

    override fun toString(): String {
        return alias
    }
}

class UI(val scanner: Scanner) {


    private val secretAgents = SecretAgents()

    fun start() {
        showMainMenu()
    }

    private fun showMainMenu() {
        while (true) {
            println("Vols (1) afegir, (2) renombrar, (3) cercar, (0) sortir?")
            when(scanner.next().toInt()) {
                1 -> addAgent()
                2 -> renameAgent()
                3 -> searchAgent()
                0 -> return
                else -> {
                    return
                }
            }
        }
    }

    private fun searchAgent() {
        print("Alias: ")
        val alias = scanner.next();

        val status = secretAgents.searchAgent(alias)
        println(status)
    }

    private fun renameAgent() {
        val alias = scanner.next();

        val newAlias = scanner.next();

        val status = secretAgents.renameAgent(alias, newAlias)
        println(status)
    }

    private fun addAgent() {
        val name = scanner.next();

        val surname = scanner.next();

        val alias = scanner.next();

        val status = secretAgents.addAgent(name, surname, alias)
        println(status)
    }
}

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val ui = UI(scanner)
    ui.start()
}