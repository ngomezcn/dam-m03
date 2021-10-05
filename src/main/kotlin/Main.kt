import java.time.LocalDate

class GamePhysics()
{
    fun calculate_hit(positionBullet : Position) : Boolean
    {
        // Calculate if bullet touch enemy or goes out window limits
        return true
    }
}

class Ammo()
{
    val position : Position = Position(0,0)
    val Physics = GamePhysics()

    fun has_touched() : Boolean
    {
        if(Physics.calculate_hit(position))
        {
            // stop run() and return True
        }
        else
        {
            // stop run() and return False
        }

        return false
    }

    fun run()
    {
        // Something to move bullet without stopping main thread
    }
}

class Position(var x : Int, var y : Int)
{
    // Movement funcs
    fun goRight() {x += 1}
    fun goLeft()  {x -= 1}
    fun goUp()    {y += 1}
    fun goDown()  {y -= 1}
}

class Robot(val nickname : String, val color : String)
{

    var health: Int = 100
    val Position : Position = Position(0,0)

    fun shoot()
    {
        // Building bullet
        var bullet : Ammo = Ammo()
        bullet.position.x = Position.x
        bullet.position.y = Position.y
        bullet.run()

        if(bullet.has_touched())
        {
            health += 10
            println("El robot" + color + " ha tocado al enemigo!")
        }
        else
        {
            println("El robot" + color + " ha fallado :(")
        }
    }
}

fun main(){

    println(LocalDate.now());
    val MrRobot = Robot("Elliot", "Green")

    // Example

}