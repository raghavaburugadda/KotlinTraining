package oops.specialclasses

abstract class CricketTeam {
    abstract var teamName: String
    abstract fun teamDress()
    abstract fun logo()
    open fun players() {

    }

    fun matches() {
        var myMatches: List<String> = ArrayList<String>()
    }
}

class IndianTeam : CricketTeam() {
    override var teamName: String="Indian Team"
    override fun teamDress() {
        TODO("Not yet implemented")
    }

    override fun players() {
        super.players()
    }

    override fun logo() {
        // I can create image,
    }
}