package scope_functions

/**
 * run function
 */
fun main() {
    // before
    val summoner = Summoner("왼손잡이들", 27)
    println(summoner)
    summoner.changeName("평범한 방식")
    summoner.incrementAge()
    println(summoner)

    // with let scope function
    Summoner("왼손잡이들", 27)
        .run {
            println(this) // 연속된 block에서는 헷갈릴 수 있으니, 단일 block에서만 사용하는 걸 추천
            this.changeName("새로운 방식")
            this.incrementAge()
            println(this)
        }
}