package receiver_object

fun main() {
    val last = "hellof".getLastChar()
    println(last)

    val testString = "this is test as you know."
    with(testString) {
        println(this.getLastChar())
    }
}

fun String.getLastChar(): Char = this[this.length - 1]