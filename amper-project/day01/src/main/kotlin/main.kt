import Utils.println
import Utils.readInput

fun main() {
    val testInput: List<String> by lazy { readInput("Day01_test") }
    val input: List<String> by lazy { readInput("Day01") }

    fun String.direction() = first()
    fun String.rotateN() = drop(1).toInt()

    class CountingDial(startingValue: Int = 50) {
        var currentValue = startingValue
            set(newVal) {
                field = newVal.mod(100)
            }

        var zeroCount = 0

        fun turn(operation: String) {
            val n = operation.rotateN()
            when (operation.direction()) {
                'R' -> rightN(n)
                'L' -> leftN(n)
            }
        }

        fun rightN(n: Int)  = repeat(n) { right() }
        fun leftN(n: Int) = repeat(n) { left() }

        fun right() = applyTick(1)
        fun left() = applyTick(-1)

        fun applyTick(n: Int) {
            currentValue += n
            incIfZero()
        }

        fun incIfZero() = currentValue.let { if (it == 0) zeroCount++ }
    }


    fun part2(input: List<String>): Int {
        val dial = CountingDial(50)
        input.forEach {
            dial.turn(it)
        }
        return dial.zeroCount
    }

    "::: Part 2 Example Solution".println()
    part2(testInput).println()
    check(part2(testInput) == 6)
    "::: Part 2 Solution".println()
    part2(input).println()


    // TODO: Ew
    fun part1(input: List<String>): Int {
        var dial = 50
        var zeroCount = 0

        // TODO: Ew
        input.forEach {
            val dir = it.first()
            val n = requireNotNull(it.drop(1).toIntOrNull())
            when (dir) {
                'R' -> dial += n
                'L' -> dial -= n
            }
            // Dafuq - I thought % was mod - it's not
            dial = dial.mod(100)
            if (dial == 0) zeroCount++
        }
        return zeroCount
    }

    // Part 1 - check test input and get actual result
    check(part1(testInput) == 3)
    println("::: Part 1 Solution: ${part1(readInput("Day01"))}")
    part1(input).println()
}
