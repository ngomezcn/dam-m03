package cat.itb.naimgomez7e5.dam.m03.uf6.beachapp

import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data.BeachDAOS
import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data.Database
import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.models.Beach

class BeachApp {

    private val db = Database()
    private val beachDAOS = BeachDAOS(db)

    init {
        db.connect()
        beachDAOS.createTableIfNotExists()
    }

    fun listBeaches() : List<Beach> {
        return beachDAOS.list()
    }

    fun editQuality(id: Int, newWaterQuality: Int) {
        val beach = beachDAOS.selectByID(id)
        beach.waterQuality = newWaterQuality
        beachDAOS.update(beach)
    }

    fun addBeach(id: Int, name: String, cityName: String, waterQuality: Int) {
        val beach = Beach(id, name, cityName, waterQuality)
        beachDAOS.insert(beach)
    }
}