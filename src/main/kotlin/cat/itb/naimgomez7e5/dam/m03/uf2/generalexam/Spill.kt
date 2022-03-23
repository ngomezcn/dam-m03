package cat.itb.naimgomez7e5.dam.m03.uf2.generalexam

class Spill(val name: String,
            val companyName: String,
            val liters: Int,
            val toxicity : Float,
            val gravity: Float = liters*toxicity) {

}

