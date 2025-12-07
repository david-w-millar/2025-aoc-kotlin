import Utils.matchAndMap
import Utils.println
import Utils.readInput
import Utils.toEnum
import kotlin.concurrent.atomics.AtomicLong
import kotlin.concurrent.atomics.ExperimentalAtomicApi

class Day01 {


    enum class Direction { L, R }

    data class DialOp(val direction: Direction, val n: Long) {
        companion object {
            val opRegex = """([LR])(\d+)""".toRegex()

            //fun validN(n: String) = 0L
            //fun validD(d: String) = Direction.L

            fun fromString2(s: String) {
                val dir = requireNotNull(s.toEnum<Direction>())
                val n = requireNotNull(s.drop(1).toLongOrNull())
            }

            fun fromString(s: String): DialOp {
                val op = opRegex.matchAndMap(s) { (d, n) ->
                    val validN = requireNotNull(n.toLongOrNull())
                    //val validD = enumValueOf<Direction>(d)
                    val validD = requireNotNull(d.toEnum<Direction>())

                    //val validN = validN(n)
                    //val validD = validD(d)
                    DialOp(validD, validN)
                }
                return op
            }
        }
    }


    @OptIn(ExperimentalAtomicApi::class)
    fun main() {

        fun part1(input: List<String>): Int {
            var dial = 50L
            var count = AtomicLong(0)
            input.map { DialOp.fromString(it) }
                .forEach {
                    dial = when(it.direction) {
                        Direction.R -> (dial + it.n) % 100
                        Direction.L -> (dial - it.n) % 100
                    }
                }

            return 0
        }

        fun part2(input: List<String>): Int {
            return input.size
        }

        // Test if implementation meets criteria from the description, like:
        //check(part1(listOf("test_input")) == 1)

        // Or read a large test input from the `src/Day01_test.txt` file:
        val testInput = readInput("Day01_test")
        //check(part1(testInput) == 1)

        val input = readInput("Day01_test")

        part1(input).println()
        part2(input).println()
    }

}
