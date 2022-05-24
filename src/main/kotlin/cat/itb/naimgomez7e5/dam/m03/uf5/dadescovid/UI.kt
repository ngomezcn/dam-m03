package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

class App {
    private val covidStatsApp =  CovidStatsApp();
    suspend fun start() {
        covidStatsApp.loadData()
        covidStatsApp.run()
    }
}

suspend fun main() {
    val application = App();
    application.start();
}