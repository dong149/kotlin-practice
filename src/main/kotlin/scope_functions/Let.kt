package scope_functions

/**
 * let function
 *
 * let 하고 also는 it을 통해서 context object를 참조한다.
 * null이 아닌 값으로만 코드 블록을 실행시키고 싶을 때 자주 사용된다.
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
        .let {
            println(it) // 연속된 block에서는 헷갈릴 수 있으니, 단일 block에서만 사용하는 걸 추천
            it.changeName("새로운 방식")
            it.incrementAge()
            println(it)
        }

    Summoner("왼손잡이들", 27)
        .also { println(it) }
        .also {
            it.changeName("새로운 방식")
            it.incrementAge()
        }
        .let {
            println(it)
        }
}