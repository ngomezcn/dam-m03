package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import java.nio.file.Path
import java.time.LocalDateTime
import kotlin.io.path.*

fun main() {
    val source = Path("file.txt")
    val target = Path("/dev/file.txt")
    source.moveTo(target);
// Target ha de ser el destí exacte, no la carpeta no posar el fitxer
// El següent és incorrecte
    source.moveTo(Path("/dev/"));
}