package safe_null

fun main() {
    val nullSummoner = Summoner(null, null)
    println(nullSummoner)

    val summoner = Summoner("왼손잡이들", 27)

    var returnIntValue = nullSummoner.getNullSummoner()?.getIncrementAge() ?: 10
    println(returnIntValue)

    returnIntValue = summoner.getIncrementAge()!!
    println(returnIntValue)
}

class Summoner(
    private val name: String?,
    private val age: Int?
) {
    private val nullSummoner = null

    fun getNullSummoner(): Summoner? {
        return nullSummoner
    }

    fun getIncrementAge(): Int? {
        return this.age?.plus(1)
    }

    override fun toString(): String {
        return "Summoner(name=$name, age=$age)"
    }
}