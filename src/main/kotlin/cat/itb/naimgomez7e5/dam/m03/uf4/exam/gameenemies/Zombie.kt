package cat.itb.naimgomez7e5.dam.m03.uf4.exam.gameenemies


class Zombie(name: String, health: Int, private val sound: String) : Enemy(name, health) {

    /**
     *  Play sound of the Zombie
     */
    private fun doSound() {
        println(sound)
    }

    /**
     *  It takes as a parameter the amount of damage and subtracts the corresponding health
     *  @param attackStrength
     */
    override fun attack(attackStrength: Int) {

        if(isAlive) {
            doSound()
            health -= attackStrength;

            afterReceivingAttack(attackStrength)
        }
        else
            printIsDead(name)
    }
}
