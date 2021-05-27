package basics

class CricketTeam {
    var teamName: String = ""
    var teamSize: Int = 0

    override fun toString(): String {
        return "From object: Team name $teamName"
    }

    fun sort() {

    }
}

fun main(args: Array<String>) {
    letDemo()
}

fun runDemo() {
    val cricketTeam: CricketTeam? = null
    cricketTeam?.run {
        teamName + "A"
        teamSize + 6
        this.sort()
    }
}


fun withDemo() {
    val cricketTeam = CricketTeam()
    val teamNumbers = with(cricketTeam)
    {
        println(teamName)
        println(teamSize)
        alsoDemo()

    }

    val teamNumbers1 = with(cricketTeam)
    {
        teamName + "A"
        teamSize + 6
    }
    print(cricketTeam.teamName)
    print(cricketTeam.teamSize)
}

fun applyDemo() {
    val cricketTeam = CricketTeam().apply {
        teamName = "India"
        teamSize = 12
        //print("Current Team ${this.toString()}")
    }


    println(cricketTeam.teamName)
    println(cricketTeam.teamSize)


    val cricketTeam1 = CricketTeam().apply {
        teamName = "India"
        teamSize = 12
        val myNewTeamSize = with(cricketTeam)
        {
            teamSize + 90
        }
        this.sort()
    }
}

fun alsoDemo(): Int {
    val myTeam = mutableListOf<String>("ramya", "raghava")
    myTeam.add("Ashwini")
    println("$myTeam")
    myTeam.remove("Ashwini")
    println("$myTeam")

    myTeam.also { it.add("Ashwini") }
        .also { println("$it") }
        .also { it.remove("Ashwini") }
        .also { println("$it") }

    val myNumbers: MutableList<Int> = mutableListOf<Int>(5, 9, 18, 2, -1, 0, 50, 1)
    myNumbers.also { println("$it") }
        .apply {
            myNumbers.add(4)
            myNumbers.add(7)
        }.also { println("$it") }
        .sort()
    println("$myNumbers")

    val mycktTeam = CricketTeam()
    mycktTeam.also { println("$it") }

    val str = "ashwini"
    str.also { println("dkfjdkjf") }

    return 0
}

fun letDemo() {
    val myName: String? = null
    val myTeam: CricketTeam? = null

    myTeam?.let {
        it.sort()
    }

    myName?.let {
        println(it.reversed())
        println(it.capitalize())
    }
}

