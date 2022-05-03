package cat.itb.naimgomez7e5.dam.m03.uf4.exam.gameenemies

class Goblin(name: String, health: Int) : Enemy(name, health) {

    /**
     *  It takes as a parameter the amount of damage and subtracts the corresponding health according to goblin logic
     *  @param attackStrength
     */
    override fun attack(attackStrength: Int) {

        if(isAlive) {
            health -= if(attackStrength <= 4) {
                1;
            } else {
                5;
            }

            afterReceivingAttack(attackStrength)
        }
        else
            printIsDead(name)
    }
}