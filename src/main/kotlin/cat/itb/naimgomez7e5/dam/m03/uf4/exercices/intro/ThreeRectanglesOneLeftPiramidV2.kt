package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.intro

import cat.itb.naimgomez7e5.dam.m03.uf4.exercices.intro.figures.*
/*
sealed class Figure(val color: String) {

    fun prepareColor() {
        print(color)
    }
    fun clearColor() {
        print(RESET)
    }
}

class RectangleFigure(color: String, val width: Int, val height: Int) : Figure(color) {
    fun paint() {
        prepareColor()
        repeat (width) {
            repeat (height) {
                print("X")
            }
            println()
        }
        clearColor()
    }
}

class LeftPiramidFigure(color: String, val base: Int) : Figure(color) {
    fun paint() {
        prepareColor()
        for (i in 0 until base+1 ) {
            print(color)
            for (j in 0 until i) {
                print('X')
            }
            println(RESET)
        }
        println()
        clearColor()
    }
}

fun main() {
    val rectangleFigure1 = RectangleFigure(RED, 4, 5)
    val leftPiramidFigure = LeftPiramidFigure(YELLOW, 3)
    val rectangleFigure2 = RectangleFigure(GREEN, 3, 5)

    rectangleFigure1.paint()
    leftPiramidFigure.paint()
    rectangleFigure2.paint()
}*/