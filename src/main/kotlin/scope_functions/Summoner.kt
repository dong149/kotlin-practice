package scope_functions

class Summoner(
    private var name: String,
    private var age: Int
) {
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