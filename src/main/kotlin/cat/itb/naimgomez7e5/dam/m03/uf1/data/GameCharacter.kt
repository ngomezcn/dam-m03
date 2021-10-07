import org.w3c.dom.events.UIEvent
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import java.util.*
import org.w3c.dom.events.EventListener
import java.awt.event.InputEvent
import java.security.Key
import javax.sql.rowset.serial.SQLInputImpl

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
    val physics = GamePhysics()

    fun has_touched() : Boolean
    {
        if(physics.calculate_hit(position))
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
    fun PrintPostion()
    {
        println("Posición: X: $x Y: $y")
    }

    enum class MoveEnum(val ToDo: Int) {
        Plus(2),
        Substract(3),
    }
    enum class CordEnum(val ToDo: Int) {
        X(0),
        Y(1),
    }

    fun move(cord : CordEnum, moveToDo: MoveEnum)
    {
        if(moveToDo == MoveEnum.Plus)
        {
            if(cord == CordEnum.X)
            {
                x += 1
            } else
            {
                y += 1
            }
        }
        else if(moveToDo == MoveEnum.Substract)
        {
            if(cord == CordEnum.X)
            {
                x -= 1
            } else
            {
                y -= 1
            }
        }
        PrintPostion()
    }

    // Movement funcs
    fun goRight() {
        move(CordEnum.X , MoveEnum.Plus)
    }
    fun goLeft()  {
        move(CordEnum.X , MoveEnum.Substract)
    }
    fun goUp()    {
        move(CordEnum.Y, MoveEnum.Plus)
    }
    fun goDown()  {
        move(CordEnum.Y, MoveEnum.Substract)
    }

}

class Robot(private val nickname : String, private val color : String)
{

    private var health: Int = 100
    public val Position : Position = Position(x = 0, y = 0)

    public fun shoot()
    {
        // Building bullet
        var bullet : Ammo = Ammo()
        bullet.position.x = Position.x
        bullet.position.y = Position.y
        bullet.run()

        if(bullet.has_touched())
        {
            health += 10
            println("El robot " + color + " ha tocado al enemigo!")
        }
        else
        {
            println("El robot " + color + " ha fallado :(")
        }
    }
}

fun createDummyString(repeat : Int, alpha : Char) : String {
    return alpha.toString().repeat(repeat)
}

class Frame(val height : Int, val width : Int, val player : Robot)
{

    var topAndDownBorder : String = ""
    var filling : String = ""

    fun makeCanvas()
    {
        topAndDownBorder = "#".toString().repeat(width)
        filling += "#"

        for (i in 1 until width-1)
        {
            filling += " "
        }
        filling += "#"

    }

    fun drawVirginFrame()
    {
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
        println("Health: 100")
        println(topAndDownBorder)
        for (i in 1 until height)
        {
            print(filling + "\n")
        }
        println(topAndDownBorder)
    }

    fun updateFrame()
    {
        print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
        drawVirginFrame()
        Thread.sleep(500)
    }
}

fun main(){

    /*val MrRobot = Robot(nickname = "Elliot", color = "verde")
    MrRobot.Position.goDown()
    MrRobot.Position.goDown()
    MrRobot.Position.goRight()
    MrRobot.shoot()*/

    val player = Robot(nickname = "Elliot", color = "verde")

    val context : Frame = Frame(height = 10, width = 50, player = player)

    context.makeCanvas()
    context.drawVirginFrame()
}

