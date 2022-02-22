package cat.itb.naimgomez7e5.dam.m03.uf2.generalexam

import java.util.*

class OilSpillArchiveUI(val scanner : Scanner, val oilSpillArchive : OilSpillArchive) {

    fun OilSpillArchiveMenu() {

        while (true) {

            println("Chose option:\n" +
                    "1. Add oil spill\n" +
                    "2. List oil spills\n" +
                    "3. Worst oil spill\n" +
                    "4. Show Spill litters\n" +
                    "5. Show spill gravity\n" +
                    "6. Spills for company\n" +
                    "7. Worst company\n" +
                    "0. Exit")

            when (scanner.nextLine().toInt()) {
                1 -> addOilSpill()
                2 -> listOilSpills()
                3 -> showWorstOilSpill()
                4 -> showSpillLitters()
                5 -> showSpillGravity()
                6 -> spillsForCompany()
                7 -> showWorstcompany()
                0 -> return
                else -> {
                    return
                }
            }
        }
    }

    private fun addOilSpill() {
        oilSpillArchive.addOilSpill(
            name = scanner.nextLine(),
            companyName = scanner.nextLine(),
            liters = scanner.nextLine().toInt(),
            toxicity = scanner.nextLine().toFloat(),
        )
    }

    private fun listOilSpills() {
        val spills: List<Spill> = oilSpillArchive.getListOilSpills()
        println("name - company - litters - toxicity - gravity")

        for (spill in spills) {
            displaySpill(spill)
        }
    }
    private fun showWorstOilSpill() {

        val worstSpill = oilSpillArchive.getWorstOilSpill()
        displaySpill(worstSpill)
    }

    private fun showSpillLitters() {
        val spill = oilSpillArchive.getSpillLitters(scanner.nextLine())
        if (spill != null) {
            println(spill.liters)
        } else {
            println("Can't find oil spill")
        }
    }

    private fun showSpillGravity() {
        val spill = oilSpillArchive.getSpillLitters(scanner.nextLine())
        if (spill != null) {
            println(spill.gravity)
        } else {
            println("Can't find oil spill")
        }
    }

    private fun spillsForCompany() {
        val spills = oilSpillArchive.getSpillsForCompany(scanner.nextLine())
        println("name - company - litters - toxicity - gravity")

        for (spill in spills) {
            displaySpill(spill)
        }
    }

    private fun showWorstcompany() {
        val worstCompany = oilSpillArchive.getWorstCompany();
        println(worstCompany)
    }

    private fun displaySpill(spill : Spill) {
        println("${spill.name} - ${spill.companyName} - ${spill.liters} - ${spill.toxicity} - ${spill.gravity}")
    }
}
