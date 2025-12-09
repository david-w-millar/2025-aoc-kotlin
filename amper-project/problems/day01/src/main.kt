@file:Suppress("ktlint:standard:filename")

import Utils.println
import Utils.readInputResource

fun part1(input: List<String>): Int {
    var dial = 50
    var zeroCount = 0

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

private fun String.direction() = first()
private fun String.rotateN() = drop(1).toInt()

private class CountingDial(startingValue: Int = 50) {
    var zeroCount = 0
    var currentValue = startingValue
        set(newVal) {
            field = newVal.mod(100)
            if (field == 0) zeroCount++
        }

    fun turn(operation: String) {
        val n = operation.rotateN()
        when (operation.direction()) {
            'R' -> repeat(n) { currentValue++ }
            'L' -> repeat(n) { currentValue-- }
        }
    }
}

fun part2(input: List<String>): Int {
    val dial = CountingDial(50)
    input.forEach {
        dial.turn(it)
    }
    return dial.zeroCount
}

fun main() {
    val testInput by lazy { readInputResource("Day01_test") }
    val input by lazy { readInputResource("Day01") }

    // test if implementation meets criteria from the description, like:
    check(part1(testInput) == 3)
    "--- Day 01: Part 1 ---".println()
    "Solution: ${part1(input)}".println()

    // test if implementation meets criteria from the description, like:
    check(part2(testInput) == 6)
    "--- Day 01: Part 2 ---".println()
    "Solution: ${part2(input)}".println()
}
