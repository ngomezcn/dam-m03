package cat.itb.naimgomez7e5.dam.m03.uf2.modularitat

import cat.itb.naimgomez7e5.dam.m03.uf1.data.project.scanner
import java.util.*
import kotlin.reflect.typeOf

class Cell(
    _posI : Int = -1,
    _posJ : Int = -1
    ) {
    var posI : Int = _posI;
    var posJ : Int = _posJ;
    var hasBoomb : Boolean = false;
    var hasOpened : Boolean = false;
    var adjBombs : Int = -1;

    fun showInformation(): Char? {
        if(hasOpened)
        {
            println("Bombes adjacents: $adjBombs")
            return '3';
        }

        if (!hasOpened) return 'X';
        if(hasOpened and hasBoomb) return 'B';

        return null;
    }
}

class Board (
        val n : Int
        ) {
    var matrix  = MutableList(n) { i -> MutableList(n) { j -> Cell(i, j) } }

    /*
    *
    */
    fun addBombs(cells : MutableList<Cell>)
    {
        for (i in cells.iterator())
        {
            i.hasBoomb = true;
        }
    }


    /*
    *
    */
    fun generateBombsList(cells : MutableList<Cell>)
    {
        val posI = mutableListOf<Int>();
        val posJ = mutableListOf<Int>();

        var sq  = MutableList<Int>(n){it};
        var index = 0;

        var timer = 0;

        while((posI.size < cells.size) or (posJ.size < cells.size))
        {
            if(((0 until 2).random() == 1) and (posI.size < cells.size))
            {
                posI.add(sq[index])
                sq.removeAt(index);
            }
            if(((0 until 2).random() == 1) and (posJ.size < cells.size))
            {
                posJ.add(sq[index])
                sq.removeAt(index);
            }

            index++;
            if(index >= sq.size-1)
            {
                index = 0;
            }
            timer++;
        }

        for (i in cells.indices)
        {
            cells[i].posI = posI[i];
            cells[i].posJ = posJ[i];
        }
    }

    /*
    *
    */
    fun CalculateAdjacencies()
    {

    }
}

fun main()
{

    val board = Board(10);
    var cells = MutableList(5) { i -> Cell(i, 99)};
    val name : String = "X";

    if(name == "X")
    {
        println("xd")
    }

    //board.addBombs(cells);

    //board.generateBombsList(cells);
    //println();
}


;






