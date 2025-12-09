@file:Suppress("ktlint:standard:filename")

import Utils.println
import Utils.readInputResource

fun part1(input: List<String>): Int {
    return input.size
}

fun part2(input: List<String>): Int {
    return input.size
}

fun main() {
    val testInput by lazy { readInputResource("Day00_test") }
    val input by lazy { readInputResource("Day00") }

    val testSolution1 = 1
    val testSolution2 = 1

    // Verify test data works, then try real data for part 1
    check(part1(testInput) == testSolution1)
    "--- Day 00: Part 1 ---".println()
    "Solution: ${part1(input)}".println()

    // Verify test data works, then try real data for part 2
    check(part2(testInput) == testSolution2)
    "--- Day 00: Part 2 ---".println()
    "Solution: ${part2(input)}".println()
}
