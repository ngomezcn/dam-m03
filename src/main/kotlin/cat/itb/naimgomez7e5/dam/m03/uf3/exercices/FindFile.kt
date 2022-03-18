package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import java.io.File
import kotlin.io.path.Path
import kotlin.text.split
fun main() {
    val path = Path("/home/sjo")
    path.toFile().walk().forEach{ file ->
        if(file.toString().split('/').last() == "file.txt"){
            println(file)
        }
    }
    val files : List<File> =  path.toFile().walk().toList()


}