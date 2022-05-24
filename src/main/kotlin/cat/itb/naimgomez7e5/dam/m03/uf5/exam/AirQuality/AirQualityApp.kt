package cat.itb.naimgomez7e5.dam.m03.uf5.exam

import java.util.*
import cat.itb.naimgomez7e5.dam.m03.uf5.exam.AirQuality.AirRecord
import cat.itb.naimgomez7e5.dam.m03.uf5.exam.AirQuality.Register

class AirQualityApp(private val scanner: Scanner) {

    private val registers = mutableListOf<Register>();
    private val airRecord = AirRecord(registers)

    fun start() {
        getRegisters()
        airRecord.run()
    }

    private fun getRegisters() {
        val elements = scanner.nextLine().toInt()

        for (i in 0 until elements) {
            val reg = scanner.nextLine()
            reg.split(" ").let {
                val year = it[0].toInt()
                val month = it[1].toInt()
                val day = it[2].toInt()
                val qN02 = it[3].toFloat()
                val qPm10 = it[4].toFloat()
                val qPm25 = it[5].toFloat()
                registers.add(Register(year, month, day, qN02, qPm10, qPm25))
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val airQualityApp = AirQualityApp(scanner)
    airQualityApp.start()
}

