package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

class Printer() {

    fun printPairData(key: String, value: Int) {
       println("$key: $value")
    }

    fun printTitle(title : String) {
        println("#### $title ####")
    }

    fun printNumberedMap(map: Map<String?, Int?>, limit : Int = 10)  {
        var index = 1;
        for ((key, value) in map) {
            println("${index}. $key $value")
            if(index >= limit) {
                println()
                return;
            };
            index++;
        }
    }
}
