package cat.itb.naimgomez7e5.dam.m03.uf4.exam.gameenemies

class Troll(name: String, health: Int, private val resistance: Int) : Enemy(name, health) {

    /**
     *  It takes as a parameter the amount of damage and subtracts the corresponding health also taking into account the damage reduction by armor
     *  @param attackStrength
     */
    override fun attack(attackStrength: Int) {

        if(isAlive) {
            if(resistance < attackStrength)
                health -= (attackStrength - resistance)

            afterReceivingAttack(attackStrength)
        }
        else
            printIsDead(name)
    }
}