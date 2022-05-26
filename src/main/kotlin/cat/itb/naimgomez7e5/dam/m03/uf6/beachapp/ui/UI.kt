package cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.ui

import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.BeachApp
import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data.BeachDAOS
import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data.Database
import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.models.Beach
import java.nio.file.Paths
import java.util.*

class UI(val scanner: Scanner) {

    private val beachApp = BeachApp()

    fun start() {
        showMainMenu()
    }

    private fun showMainMenu() {
        while (true) {
            println("Vols (1) afegir, (2) modificar qualitat, (3) llistar, (4) resum?")
            when(scanner.next().toInt()) {
                1 -> addBeach()
                2 -> editQuality()
                3 -> listBeaches()
                4 -> resume()
                0 -> return
                else -> {
                    return
                }
            }

        }
    }

    private fun resume() {
        val beaches : List<Beach> = beachApp.listBeaches()

        val a = beaches.groupBy { it.cityName }

        for (i in beaches.indices) {
            println("$i. ${beaches[i].name} (${beaches[i].waterQuality.toFloat()})")
        }
    }

    private fun listBeaches() {
        val beaches : List<Beach> = beachApp.listBeaches()
        beaches.forEach {
            println(it)
        }
    }

    private fun editQuality() {
        val id = scanner.next().toInt()
        val newWaterQuality = scanner.next().toInt()
        beachApp.editQuality(id, newWaterQuality)
    }

    private fun addBeach() {
        println("Introdueix l'identificador, nom, ciutat i qualitat")

        val id = scanner.next().toInt()
        val name = scanner.next()
        val cityName = scanner.next()
        val waterQuality = scanner.next().toInt()

        beachApp.addBeach(id, name, cityName, waterQuality)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val ui = UI(scanner);
    ui.start()
}