import Utils.println
import Utils.readInput

class Day01 {

    fun main() {

        // Ew
        fun part1(input: List<String>): Int {
            var dial = 50
            var zeroCount = 0

            // Ew
            input.forEach {
                val dir = it.first()
                val n = requireNotNull(it.drop(1).toIntOrNull())
                when(dir) {
                    'R' -> dial += n
                    'L' -> dial -= n
                }
                // Dafuq - I thought % was mod - it's not
                dial = dial.mod(100)
                if(dial == 0) zeroCount++
            }
            return zeroCount
        }

        fun part2(input: List<String>): Int {
            return input.size
        }


        // Part 1 - check test input and get actual result
        check(part1(readInput("Day01_test")) == 3)
        println("::: Result: ${part1(readInput("Day01")) }")

        //val input = readInput("Day01")
        //part1(input).println()
        //part2(input).println()
    }

}
