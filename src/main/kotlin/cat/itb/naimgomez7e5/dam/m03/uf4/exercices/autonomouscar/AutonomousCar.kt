package cat.itb.naimgomez7e5.dam.m03.uf4.autonomouscar

class AutonomousCar(val carSensors: CarSensors) {
    fun doNextNSteps(n :Int){
        repeat(n){
            nextStep()
        }
    }

    private fun goIfPossible(direction: Direction):Boolean{
        val freeDirection = !carSensors.isThereSomethingAt(direction)
        if(freeDirection)
            carSensors.go(direction)
        return freeDirection
    }

    private fun nextStep() {
        if(goIfPossible(Direction.FRONT))
            return
        if(goIfPossible(Direction.RIGHT))
            return
        if(goIfPossible(Direction.LEFT))
            return
        carSensors.stop()
    }


}

