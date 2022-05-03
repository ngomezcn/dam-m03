package cat.itb.naimgomez7e5.dam.m03.uf4.exam.gameenemies

fun main() {
    val enemies : List<Enemy> = listOf(
        Zombie("Zog", 10, "AARRRrrgg"),
        Zombie("Lili", 30, "GRAaaArg"),
        Troll("Jum", 12, 5),
        Goblin("Tim", 60))

    enemies[0].attack(5)
    enemies[0].attack(7)
    enemies[3].attack(7)
    enemies[1].attack(3)
    enemies[2].attack(4)
    enemies[2].attack(8)
    enemies[1].attack(4)
    enemies[0].attack(5)
    enemies[0].attack(1)
    enemies[2].attack(1)
    enemies[2].attack(1)
    enemies[2].attack(1)
    println(enemies)
}