package cat.itb.naimgomez7e5.dam.m03.uf5.exam.AirQuality


class AirRecord(private val registers: List<Register>) {

    fun run() {
        val maxQn02 = highestQuantityN02()
        println("Max no2: $maxQn02")

        val avgPm10 = averagePm10()
        println("Average Pm10: $avgPm10")

        val dangerousCount = dangerousRegistryCount()
        println("Dangerous count: $dangerousCount")

        val worstCases = worstCases()
        println("Worst no2 2022:")
        for (i in worstCases.indices) {
            println("$i ${worstCases[i]}")
        }
    }

    private fun highestQuantityN02(): Register {
        return registers.sortedByDescending { it.no2 }.first { it.no2 > 0 }
    }

    private fun averagePm10(): Double {
        return registers.filter { it.year >= 2021 }.map { it.pm10 }.average()
    }

    private fun dangerousRegistryCount(): Int {
        return registers.count { it.no2 > 4 || it.pm25 > 15 || it.pm10 > 45 }
    }

    private fun worstCases() : List<Register> {

        val worstCases = registers
            .filter { it.year == 2022 }.sortedWith(Comparator { o1, o2 ->
                if (o1.no2 < o2.no2) {
                    return@Comparator 1
                }
                return@Comparator -1
            }).take(3)

        return worstCases
    }
}
