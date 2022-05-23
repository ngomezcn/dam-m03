package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

class UI {
    private val printer = Printer();
    private val covidStatsApp =  CovidStatsApp(printer);

    suspend fun start() {
        covidStatsApp.loadData()
        covidStatsApp.run()
    }
}

suspend fun main() {
    val ui = UI();
    ui.start();
}