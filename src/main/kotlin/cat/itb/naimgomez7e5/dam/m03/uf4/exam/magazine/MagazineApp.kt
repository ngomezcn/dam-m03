package cat.itb.naimgomez7e5.dam.m03.uf4.exam.magazine

/**
 * Creates the list of articles (Printables)
 */
fun createArticles(): List<Printable> {
    return listOf(
        OpinionArticle("Higiene democràtica", "Esther Vera", "consectetur adipiscing elit. In metus turpis, varius a erat id, pretium finibus tortor."),
        OpinionArticle("La inèrcia de l'estat", "Javier Perez Royo", "commodo odio sit amet, mollis felis. Morbi arcu justo, feugiat tincidunt tincidunt non."),
        PhotographicArticle("Unspoken", "Lorena Ros", listOf("img14232.jpg", "img8467.jpg", "img1487.jpg"))
    )
}

fun main(){
    val articles : List<Printable> = createArticles()
    val printer = DummyMagazinePrinter()
    for(article in articles)
        article.print(printer)
}

/**
 * Printer that prints on the console
 */
class DummyMagazinePrinter : MagazinePrinter{
    override fun printTitle(title: String, author: String) {
        println("$title - $author")
        println("------------")
    }

    override fun printText(text: String) {
        println(text)
        println()
        println()
    }

    override fun printPhotos(photos: List<String>) {
        photos.forEach{ println(it) }
        println()
        println()
    }
}