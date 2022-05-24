package cat.itb.naimgomez7e5.dam.m03.uf5.exam.SecretAgents

class SecretAgents {
    var agents = mutableListOf<Agent>();
    var joinAgentsAlias = mutableMapOf<String, Agent>()

    fun addAgent(name: String, surname: String, alias: String) : String{
        val agent = Agent(name, surname)
        agents.add(agent)

        if(aliasIsValid(alias))
            if(!aliasExists(alias))
                joinAgentsAlias[alias] = agent
            else
                return "Aquest àlias ja està utilitzat"
        else
            return "Àlies invàlid"

        return "Creat"
    }

    private fun aliasExists(alias: String): Boolean {
        return joinAgentsAlias.containsKey(alias)
    }

    private fun aliasIsValid(alias: String): Boolean {
        val reg = Regex("^[A-Z][a-zA-Z]{3,}[0-9]$")
        return reg.matches(alias)
    }

    fun renameAgent(alias: String, newAlias: String) : String {

        if(aliasExists(newAlias) || !aliasExists(alias))
            return "Àlies incorrectes"
        else{
            joinAgentsAlias[alias]?.let {
                joinAgentsAlias.remove(alias)
                joinAgentsAlias[newAlias] = it
            }
        }
        return "Renombrat"
    }

    fun searchAgent(alias: String) : String {
        return joinAgentsAlias[alias]?.name ?: "No existex aquest àlias"
    }
}