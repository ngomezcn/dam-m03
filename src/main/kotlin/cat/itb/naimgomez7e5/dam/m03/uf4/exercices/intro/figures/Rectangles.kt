package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.intro.figures

class Rectangle(val color: String, val length: Int, val width: Int) {

    fun paint() {
        println("${getCanvas()} $RESET")
    }

    private fun getCanvas():String {
        var canvas = "";
        for(i in 0 until length) {
            for(j in 0 until width) {
                canvas += "${color}X";
            }
            canvas += "\n";
        }
        return canvas;
    }
}

