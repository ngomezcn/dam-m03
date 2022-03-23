package cat.itb.naimgomez7e5.dam.m03.uf2.generalexam

class OilSpillArchive(private val appState: AppState) {

    fun addOilSpill(name: String,companyName: String,liters: Int,toxicity : Float) {
        appState.oilsSpills.add(Spill(name, companyName, liters, toxicity))
    }

    fun getListOilSpills() : List<Spill> {

        return appState.oilsSpills
    }

    fun getWorstOilSpill(): Spill {

        return (appState.oilsSpills.sortedBy { it.gravity }).last()
    }

    fun getSpillLitters(spillName: String): Spill? {
        return getSpillByName(spillName)
    }

    fun getSpillGravity(spillName: String): Spill? {
        return getSpillByName(spillName)
    }

    fun getSpillsForCompany(companyName: String) : List<Spill> {
        val spillCompanies = mutableListOf<Spill>();

        for (spill in appState.oilsSpills)
        {
            if(spill.companyName == companyName)
                spillCompanies.add(spill)
        }

        return spillCompanies
    }

    fun getWorstCompany(): String {

        val spillsByDistinctCompanies = (appState.oilsSpills.distinctBy { it.companyName })
        var max: Float = 0F;
        var maxCompany = ""

        for (spillByCompany in spillsByDistinctCompanies) {
            var sum: Float = 0F;
            for(spill in getSpillsForCompany(spillByCompany.companyName)){
                sum += spill.gravity
                if(sum > max)
                    max = sum;
                    maxCompany = spill.companyName
            }
        }
        return maxCompany
    }

    private fun getSpillByName(spillName : String): Spill? {
        return appState.oilsSpills.find { it.name == spillName };
    }
}