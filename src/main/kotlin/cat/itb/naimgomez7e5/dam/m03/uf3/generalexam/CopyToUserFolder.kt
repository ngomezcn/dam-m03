package cat.itb.naimgomez7e5.dam.m03.uf3.generalexam

import java.nio.file.Path
import java.util.*
import kotlin.io.path.*

class CopyToUserFolder(private var fileToCopy: Path, private val destinationPath: Path, val name : String, val lastName: String ) {

    /**
     * On create the object we make sure that the destination directory will exist
     */
    init {
        if(!destinationPath.exists() || destinationPath.isRegularFile()) {
            destinationPath.createDirectories();
        }
    }

    /**
     * Return the abosulute path with the subfolders of the user
     */
    private fun getuserDir(): Path {
        val userPath = destinationPath.resolve(lastName).resolve(name)
        if(!userPath.exists() || destinationPath.isRegularFile()) {
            userPath.createDirectories()
        }
        return userPath;
    }

    /**
     * We make the copy of the indicated file in the user directory.
     * @param The file path is the one indicated in the constructor but you can also pass a new one to the function.
     */
    fun makeCopy(fileToCopy: Path = this.fileToCopy) {

        val userPath = getuserDir();
        val destFilePath = userPath.resolve(fileToCopy.fileName);

        if(fileToCopy.exists()) {

            if(fileToCopy.isRegularFile()) {
                fileToCopy.copyTo(destFilePath, true); // If the file already exists it will be overwritten
                println("Fitxer copiat a la carpeta $userPath")
            }
            else {
                println("No es pot copiar una carpeta");
            }

        } else
        {
            println("El fitxer no existeix");
        }
    }
}


fun main() {
    val scanner = Scanner(System.`in`);

    /*val indicatedPath = Path("/home/sjo/some_file");
    val destPath = Path("/home/sjo/destinationFolder");
    val name: String = "Mar";
    val lastName: String = "Pi";*/
    val indicatedPath = Path(scanner.nextLine());
    val destPath = Path(scanner.nextLine());
    val name: String = scanner.nextLine();
    val lastName: String = scanner.nextLine();

    val copyToUserDir= CopyToUserFolder(indicatedPath, destPath, name, lastName)
    copyToUserDir.makeCopy();
}