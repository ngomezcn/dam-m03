package cat.itb.naimgomez7e5.dam.m03.uf2.generalexam

import java.util.*

class UI() {

    private val scanner = Scanner(System.`in`);
    private val appState = AppState()
    private val oilSpillArchive = OilSpillArchive(appState)
    private val oilSpillArchiveUI = OilSpillArchiveUI(scanner, oilSpillArchive)

    fun init() {
        oilSpillArchiveUI.OilSpillArchiveMenu()
    }
}

fun main() {
    UI().init();
}