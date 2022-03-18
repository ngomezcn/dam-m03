package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import java.nio.file.Path
import kotlin.io.path.Path
import java.util.*
import kotlin.io.path.createDirectories
import kotlin.io.path.createFile

fun main() {
    val scanner = Scanner(System.`in`)
    val homePath : Path = Path(System.getProperty("user.home"));
    val path = homePath.resolve("test")
    path.createDirectories();
    for(i in 0..100){
        val folder = path.resolve("$i")
        folder.createDirectories();
    }
}