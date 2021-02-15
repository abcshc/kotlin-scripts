val list = listOf(1, 2, 3, 4, 5, 6, 7)
for (item: Int in list) print(item)
println()
for (item: Int in 1..7) print(item)
println()
for (i in list.indices) {
    print(list[i])
}
println()
for ((index, value) in list.withIndex()) {
    println("index: $index, value: $value")
}
var x = 10
while (x > 0) {
    print(x--)
}
println()
do {
    print(x++)
} while (x < 10)
println()
loop@ for (i in 1..100) {
    inner@ for (j in 1..4) {
        println("i: $i, j: $j")
        if (j == 3) {
            if(i == 2) {
                break@loop
            }
            break@inner
        }
    }
}