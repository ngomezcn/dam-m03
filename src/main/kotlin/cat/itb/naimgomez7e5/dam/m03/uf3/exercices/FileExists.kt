package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import java.nio.file.Path
import kotlin.io.path.Path
import java.util.*
import kotlin.io.path.exists

fun main() {
    val scanner = Scanner(System.`in`);

    val path : Path = Path(scanner.nextLine())

    if (path.exists())
    {
        println("lolask")
    }
}