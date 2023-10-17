// Good Old Pyramid Stars
fun main(args: Array<String>) {
    val x: Int = 5

    for (i in 0 until x) {
        repeat(x - i) { print(" ") }
        repeat(i * 2 + 1) { print("*") }
        println()
    }
}
