data class Person(
    val name: String? = null,
    val age: Int = 30
)

val anonymous = Person()
val named = Person("kim")

fun returnName(input: Person) {
    println(input)
    input.name ?: return
    println("passed! name: ${input.name}, age: ${input.age}")
}

returnName(anonymous)
returnName(named)