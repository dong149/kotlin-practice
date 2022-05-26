package scope_functions

/**
 * Apply
 *
 * 객체 초기화시 가장 많이 사용된다.
 */
fun main() {
    val summoner = Summoner("이름", 27).apply {
        this.win = false
    }

    println(summoner)
    println(summoner.win)
}