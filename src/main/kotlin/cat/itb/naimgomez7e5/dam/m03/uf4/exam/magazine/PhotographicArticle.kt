package cat.itb.naimgomez7e5.dam.m03.uf4.exam.magazine

class PhotographicArticle(private val title: String, private val author: String, private val images: List<String>) : Printable {
    override fun print(magazinePrinter: MagazinePrinter) {

        magazinePrinter.printTitle("Fotos: $title", author)
        magazinePrinter.printPhotos(images)
    }
}
