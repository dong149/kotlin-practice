package scope_functions

class Summoner(
    var win: Boolean
) {
    private var name: String = "test"
    private var age: Int = 0

    constructor(name: String, age: Int) : this(win = true) {
        this.name = name
        this.age = age
    }

    fun changeName(name: String) {
        this.name = name
    }

    fun incrementAge() {
        this.age++
    }

    override fun toString(): String {
        return "Name = $name, Age = $age"
    }
}