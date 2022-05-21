package print

fun main(args: Array<String>) {
    val persons = listOf(
        Person("영희", age = 20),
        Person("철수", age = 32),
        Person("동훈", age = 29)
    )

    val oldest = persons.maxOf { it.age!! }

    println("나이가 가장 많은 사람 : $oldest")
}

data class Person(val name: String, val age: Int? = null) {
}