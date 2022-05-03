package cat.itb.naimgomez7e5.dam.m03.uf4.autonomouscar

interface CarSensors {
    fun isThereSomethingAt(direction: Direction) : Boolean
    fun go(direction : Direction)
    fun stop()
}
