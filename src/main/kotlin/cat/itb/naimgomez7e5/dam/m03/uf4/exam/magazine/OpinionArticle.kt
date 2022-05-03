package cat.itb.naimgomez7e5.dam.m03.uf4.exam.magazine

class OpinionArticle(private val title: String, private val author: String, private val opinion: String) : Printable {
    override fun print(magazinePrinter: MagazinePrinter) {

        magazinePrinter.printTitle("Opinió: $title", author)
        magazinePrinter.printText(opinion)
    }
}
