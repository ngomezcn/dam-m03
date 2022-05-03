package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.enum


fun <T> firstElementOf(list: List<T>) : T {
    return list.first()
}
fun main() {
    val a = listOf(1,2,3);
    val b = listOf("hola", "hola");

    val c = firstElementOf(a)
    val z = firstElementOf(b)
}