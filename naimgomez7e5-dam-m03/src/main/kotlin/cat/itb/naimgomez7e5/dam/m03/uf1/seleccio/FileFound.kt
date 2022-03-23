package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

fun main(){
    val mainPackage = "cat.itb.naimgomez7e5.dam"
    val suiteSubPackage = "m03.uf1.seleccio"
    val className = "InsideCircle"
    val fullClassName = "$mainPackage.$suiteSubPackage.${className}Kt"

    try {
        val clazz = Class.forName(fullClassName)
        println("File Found")
    } catch (e: ClassNotFoundException){
        println("File not Found")
    }
}