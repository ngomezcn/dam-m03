package cat.itb.naimgomez7e5.dam.m03.uf4.exam.gameenemies
sealed class Enemy(internal val name: String, internal var health: Int) {

    /**
     * Returns boolean value depending if enemy is alive
     */
    val isAlive : Boolean
        get() = health > 0;

    /**
     * This function subtracts the health of the enemy according to the damage received
     */
    open fun attack(attackStrength : Int) {
        if(isAlive) {
            health -= attackStrength;

            afterReceivingAttack(attackStrength)
        }
        else
            printIsDead(name)
    }

    /**
     *  Perform the necessary steps after receiving the attack
     */
    open fun afterReceivingAttack(attackStrength: Int) {
        if (!isAlive) {
            health = 0
            printIsDead(name)
        }
        else
            printAttackStatus(name, health, attackStrength)
    }

    /**
     *  Prints the status of the received attack
     */
    open fun printAttackStatus(name: String, health: Int, attackStrength: Int) {
        println("L'enemic $name té $health punts de vida després d'un atac de $attackStrength")
    }

    /**
     *  Print that the enemy is dead
     */
    open fun printIsDead(name: String) {
        println("L'enemic $name està mort")
    }

    /**
     *  Return the enemy's name and health
     *  @return String
     */
    override fun toString(): String {
        return "name: $name, live: $health"
    }
}

