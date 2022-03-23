import java.io.*
import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`);
    val n = scan.nextInt();
    val phoneBook: MutableMap<String, String> = HashMap();

    val names = mutableListOf<String>()

    repeat(n)
    {
        phoneBook[scan.next()] = scan.next()
    }

    repeat(n)
    {
        names.add(scan.next());
    }

    for (i in names.iterator())
    {
        val search = phoneBook[i];
        if(search == null)
        {
            println("Not found")
        }
        if(search != null)
        {
            println("$i=$search")
        }
    }
}
