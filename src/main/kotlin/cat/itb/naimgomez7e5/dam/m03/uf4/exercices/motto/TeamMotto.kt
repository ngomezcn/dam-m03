package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.motto

fun main() {
    val teams = listOf(
        BasketballTeam("Mosques", "Bzzzanyarem"),
        VolleyballTeam("Dragons", "Grooarg", "verd"),
        GolfTeam("Abelles", "Piquem Fort", "Ko Jin-Young"))
    shoutMottos(teams)
}

fun shoutMottos(teams: List<Team>){
    for(team in teams)
        team.shoutMotto()
}
