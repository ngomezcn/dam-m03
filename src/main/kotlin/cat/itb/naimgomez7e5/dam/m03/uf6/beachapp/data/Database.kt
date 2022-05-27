package cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.data

import java.sql.Connection
import java.sql.DriverManager

const val databaseFile = "beach_app.db"
class Database {
    var connection: Connection? = null

    fun connect(): Connection {
        connection = DriverManager.getConnection("jdbc:sqlite:$databaseFile")
        return connection!!
    }
}
