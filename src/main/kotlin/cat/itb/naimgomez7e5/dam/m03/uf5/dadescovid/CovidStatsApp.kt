package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

import cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models.CovidData

class CovidStatsApp(private val ui: Printer) {

    private val api = Api();

    lateinit var covidData : CovidData;
    var euCountryCodes = listOf("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL")

    private fun top10Deaths() {
        covidData.countries.sortByDescending { it.totalDeaths }
        //val a = covidData.countries.sortedWith(Comparator { o1, o2 -> o1.totalDeaths.compareTo(o2.totalDeaths)   })
        val orderedMapByDeaths : Map<String?, Int?> = covidData.countries.associate { it.country to it.totalDeaths }

        ui.printTitle("Most deaths")
        ui.printNumberedMap(orderedMapByDeaths)
    }

    private fun top10Confirmed() {
        covidData.countries.sortByDescending { it.newConfirmed }
        val orderedMapByNewConfirmed: Map<String?, Int?> = covidData.countries.associate { it.country to it.newConfirmed }

        ui.printTitle("New confirmed")
        ui.printNumberedMap(orderedMapByNewConfirmed)
    }

    private fun europeData() {
        val totalDeaths = covidData.countries.filter { it.countryCode in euCountryCodes }.sumOf { it.totalDeaths!! }
        val totalNewConfirmed = covidData.countries.filter { it.countryCode in euCountryCodes }.sumOf { it.newConfirmed!! }

        ui.printTitle("EU data")
        ui.printPairData("Total Deaths", totalDeaths)
        ui.printPairData("New confirmed", totalNewConfirmed)
    }

    fun run() {
        top10Deaths()
        top10Confirmed()
        europeData()
    }

    suspend fun loadData() {
        covidData = api.loadSummaryData();
    }
}

