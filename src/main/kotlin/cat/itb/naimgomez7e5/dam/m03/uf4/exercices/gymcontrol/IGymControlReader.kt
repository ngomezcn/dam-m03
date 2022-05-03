package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.gymcontrol

import java.util.*

interface IGymControlReader {
    fun nextId() : String
}

class GymControlManualReader(val scanner:Scanner = Scanner(System.`in`)) : IGymControlReader {
    override fun nextId() = scanner.next()
}

fun main() {
    val users = mutableListOf<String>()
    val scanner = Scanner(System.`in`)
    val reader : IGymControlReader = GymControlManualReader()
    while(true){
        readNewUser(users, reader)
    }
}

fun readNewUser(users: MutableList<String>, reader: IGymControlReader) {
    val id = reader.nextId()
    val exists = users.remove(id)
    if(!exists)
        users.add(id)
    val action = if(exists) "Sortida" else "Entrada"
    println("$id $action")
}
