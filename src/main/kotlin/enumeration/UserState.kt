package enumeration

enum class UserState(
    val state: String
) {
    APPROVED("승인"),
    NOT_APPROVED("승인되지 않음");

    companion object {
        fun fromValue(value: String) = values().find { it.name == value }
    }
}

fun main() {
    val input = "APPROVED"
    val result = UserState.fromValue(input)

    print(result?.state)
}