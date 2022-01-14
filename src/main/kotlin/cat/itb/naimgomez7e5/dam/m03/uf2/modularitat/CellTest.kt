package cat.itb.naimgomez7e5.dam.m03.uf2.modularitat

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CellTest {

    @Test
    fun get_state() {
        val cell = Cell(0,0);
        val result = cell.showInformation();


        assertEquals('X', result)
    }
}