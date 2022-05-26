package cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data

import cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.models.Beach
import java.sql.Connection
import java.sql.ResultSet

class BeachDAOS(private val database: Database) {
    private val connection: Connection get() = database.connection!!

    fun createTableIfNotExists() {
        val createQuery = "CREATE TABLE IF NOT EXISTS beach(id INTEGER PRIMARY KEY, beachName VARCHAR, cityName VARCHAR, waterQuality INTEGER)"
        val createStatement = connection.prepareStatement(createQuery)
        createStatement.execute()
    }

    fun list(): List<Beach> {
        val query = "SELECT * FROM beach"
        val listStatement = connection.createStatement()
        val resultat: ResultSet = listStatement.executeQuery(query)
        return toBeachList(resultat)
    }

    fun update(beach: Beach) {
        val query = "UPDATE beach SET beachName = ?, cityName = ?, waterQuality = ? WHERE id = ?"
        val statement = connection.prepareStatement(query)
        statement.setInt(4, beach.id)
        statement.setString(1, beach.name)
        statement.setString(2, beach.cityName)
        statement.setInt(3, beach.waterQuality)
        statement.execute()
    }

    fun insert(beach: Beach) {
        val query = "INSERT INTO beach(id, beachName, cityName, waterQuality) VALUES(?, ?, ?, ?)"
        val statement = connection.prepareStatement(query)
        statement.setInt   (1, beach.id)
        statement.setString(2, beach.name)
        statement.setString(3, beach.cityName)
        statement.setInt(4, beach.waterQuality)
        statement.execute()
    }

    fun selectByID(id: Int): Beach {
        val query = "SELECT * FROM beach WHERE id = ?"
        val statement = connection.prepareStatement(query)
        statement.setInt(1, id)
        val result: ResultSet = statement.executeQuery()
        return toBeach(result)
    }

    private fun toBeachList(result: ResultSet): List<Beach> {
        val list: MutableList<Beach> = mutableListOf()
        while (result.next()) {
            list += toBeach(result)
        }
        return list
    }

    private fun toBeach(result: ResultSet): Beach {
        val id = result.getInt("id")
        val name = result.getString("beachName")
        val cityName = result.getString("cityName")
        val waterQuality = result.getInt("waterQuality")
        return Beach(id, name, cityName, waterQuality)
    }
}
