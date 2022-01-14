package cat.itb.naimgomez7e5.dam.m03.uf2.modularitat

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BoardTest {

    @Test
    fun addBombs() {
        var cells = MutableList(10) { i -> Cell(i, 0)};
        var board = Board(0);

        board.addBombs(cells);

        for(cell in cells.iterator())
        {
            assertEquals(true, cell.hasBoomb)
        }
    }
}