package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.generales

import java.sql.Date
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.LinkedList
import java.util.StringJoiner

class Person(nom: String, val cognom : String, val dataNaixement : LocalDate, dni : String) : Comparable<LocalDate>  {
    override fun compareTo(other: LocalDate): Int {
        if(other > this.dataNaixement) {
            return -1
        }
        return 1
    }

    override fun toString(): String {
        return "${this.dataNaixement}"
    }

}

fun main() {

    val p = listOf<Person>(
        Person("a", "a", LocalDate.parse("2023-07-25", DateTimeFormatter.ISO_DATE), "123123"),
        Person("a", "a", LocalDate.parse("2017-07-25", DateTimeFormatter.ISO_DATE), "123123"),
        Person("a", "a", LocalDate.parse("2018-07-25", DateTimeFormatter.ISO_DATE), "123123"),
        Person("a", "a", LocalDate.parse("2019-07-25", DateTimeFormatter.ISO_DATE), "123123"),
        Person("a", "a", LocalDate.parse("2020-07-25", DateTimeFormatter.ISO_DATE), "123123"),
        Person("a", "a", LocalDate.parse("2021-07-25", DateTimeFormatter.ISO_DATE), "123123"),
    )
    val b = listOf<Int>()


    b.sortedWith(compareBy<Int> {it}.thenBy { it })

    println(p)
    p.sortedWith(compareBy<Person> { it.dataNaixement }.thenBy { it.cognom })
    println(p)
}
