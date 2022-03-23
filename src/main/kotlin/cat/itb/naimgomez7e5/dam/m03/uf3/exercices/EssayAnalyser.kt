package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import java.util.*
import kotlin.io.path.Path
import kotlin.io.path.readText


fun main() {
    val path = Path("E:\\GitRepos\\naimgomez7e5-dam-m03\\src\\main\\kotlin\\cat\\itb\\naimgomez7e5\\dam\\m03\\uf3\\exercices\\file.txt")

    val text = path.readText();

    //val lines = text.count { it == '\n' } + 1
    val words = text.count { it == ' '}
    //println("lines $lines")
    println("words $words")
}