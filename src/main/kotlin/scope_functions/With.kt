package scope_functions

/**
 * with
 *
 * 이미 생성된 Context Object 객체를 인자로 받아서 사용하는 것이 효율적일 때 사용하면 좋다.
 */
fun main() {
    val summoner = Summoner("왼손잡이들", 27)

    with(summoner) {
        changeName("with으로 바꾸자")
        incrementAge()
        println(summoner)
    }
}