package cat.itb.naimgomez7e5.dam.m03.uf1.adventofcode

import java.util.*
import kotlin.io.path.Path

fun main() {
    val scanner = Scanner(Path("data/input_day6"));

   var fishes = scanner.nextLine().split(',').map { it.toInt() }.toMutableList()
    var list = MutableList<Int>(9){0};

    for (fish in fishes)
    {
        list[fish]++;
    }

    repeat(18)
    {
        var fish = list.removeAt(0);
        list[6] += fish;
        list.add(8, fish)
    }

    println(list.sum())
}