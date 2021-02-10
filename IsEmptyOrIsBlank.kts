val blank = " "
val empty = ""
// static typing is required
val nul: CharSequence? = null
println("\" \" is empty -> ${blank.isEmpty()}")
// " " is empty -> false
println("\" \" is blank -> ${blank.isBlank()}")
// " " is blank -> true
println("\"\" is empty -> ${empty.isBlank()}")
// "" is empty -> true
println("\"\" is blank -> ${empty.isBlank()}")
// "" is blank -> true
println("null is empty -> ${nul.isNullOrEmpty()}")
// null is empty -> true
println("null is blank -> ${nul.isNullOrBlank()}")
// null is blank -> true