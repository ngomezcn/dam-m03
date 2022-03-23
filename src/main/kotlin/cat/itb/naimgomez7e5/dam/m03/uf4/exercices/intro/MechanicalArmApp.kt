package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.intro


class Arm(
    private var turnStatus: Boolean = false,
private var armAngel: Float = 0.0f,
private var armHeight: Float = 0.0f

) {

    fun updateAngle(deltaAngel: Float) {
        armAngel += deltaAngel;
    }

    fun updateAltitude(deltaAltitude: Float) {
        armHeight += deltaAltitude;
    }

    fun setTurnedOn(newTurnStatus : Boolean) {
        this.turnStatus = newTurnStatus;
    }

}

fun main() {

    val myArm = Arm();

    println(myArm)
}