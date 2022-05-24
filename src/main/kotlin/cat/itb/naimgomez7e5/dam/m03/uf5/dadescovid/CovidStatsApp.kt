package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

import cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models.CovidData

class CovidStatsApp() {

    private val api = Api();

    lateinit var covidData : CovidData;
    var euCountryCodes = listOf("BE", "EL", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "HR", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL")
    private lateinit var countriesCodes: Map<String, String>;
    private lateinit var populationByCode: Map<String, Long>;

    private fun top10Deaths() {
        covidData.countries.sortByDescending { it.totalDeaths }
        //val a = covidData.countries.sortedWith(Comparator { o1, o2 -> o1.totalDeaths.compareTo(o2.totalDeaths)   })
        val orderedMapByDeaths : Map<String?, Int?> = covidData.countries.associate { it.country to it.totalDeaths }

        printTitle("Most deaths")
        printNumberedMap(orderedMapByDeaths)
    }

    private fun top10Confirmed() {
        covidData.countries.sortByDescending { it.newConfirmed }
        val orderedMapByNewConfirmed: Map<String?, Int?> = covidData.countries.associate { it.country to it.newConfirmed }

        printTitle("New confirmed")
        printNumberedMap(orderedMapByNewConfirmed)
    }

    private fun europeData() {
        val totalDeaths = covidData.countries.filter { it.countryCode in euCountryCodes }.sumOf { it.totalDeaths!! }
        val totalNewConfirmed = covidData.countries.filter { it.countryCode in euCountryCodes }.sumOf { it.newConfirmed!! }

        printTitle("EU data")
        println("Total Deaths $totalDeaths")
        println("New confirmed $totalNewConfirmed")
        println()
    }

    private fun rateDeathsByCapita(code:String?) : Double {
        return (covidData.countries.filter { it.countryCode == code }.sumOf { it.totalDeaths!! } / getPopulationOfCountry(code!!).toDouble())*100
    }

    private fun deathsPerCapitaSpain() {
        val deathsPerCapita = rateDeathsByCapita("ES")

        printTitle("SPAIN")
        println("Deaths per capita $deathsPerCapita%")
        println()
    }

    private fun deathsByPopulation() {
        val a = covidData.countries.sortedWith(Comparator { o1, o2 ->
            if (rateDeathsByCapita(o1.countryCode) < rateDeathsByCapita(o2.countryCode)) {
                return@Comparator 1
            }
            return@Comparator -1
        }).take(10)

        printTitle("Death By Population")
        for (i in a.indices) {
            println("${i+1}. ${a[i].country} total : ${a[i].totalDeaths} population : ${a[i].countryCode?.let { getPopulationOfCountry(it) }} : ${rateDeathsByCapita(a[i].countryCode)}%")
        }

    }

    private fun getPopulationOfCountry(countryCode: String): Long {
        return populationByCode[countriesCodes[countryCode]] ?: -1
    }

    fun run() {
        top10Deaths()
        top10Confirmed()
        europeData()
        deathsPerCapitaSpain()
        deathsByPopulation()
    }

    suspend fun loadData() {
        covidData = api.loadSummaryData();
        countriesCodes = api.loadEUCountryCodes();
        populationByCode = api.loadCountriesPopulation();
    }

    private fun printTitle(title : String) {
        println("#### $title ####")
    }

    private fun printNumberedMap(map: Map<String?, Int?>, limit : Int = 10)  {
        var index = 1;
        for ((key, value) in map) {
            println("${index}. $key $value")
            if(index >= limit) {
                println()
                return;
            };
            index++;
        }
    }
}

