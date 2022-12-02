fun main() {

    fun part1(input: List<String>): Int {
        var totalScore = 0

        input.forEach { round ->
            when (round.first()) {
                // Rock
                'A' -> {
                    totalScore += when (round.third()) {
                        // Rock
                        'X' -> (1 + 3)
                        // Paper
                        'Y' -> (2 + 6)
                        // Scissors
                        'Z' -> (3 + 0)
                        else -> throw IllegalStateException()
                    }
                }
                // Paper
                'B' -> {
                    totalScore += when (round.third()) {
                        // Rock
                        'X' -> (1 + 0)
                        // Paper
                        'Y' -> (2 + 3)
                        // Scissors
                        'Z' -> (3 + 6)
                        else -> throw IllegalStateException()
                    }
                }
                // Scissors
                'C' -> {
                    totalScore += when (round.third()) {
                        // Rock
                        'X' -> (1 + 6)
                        // Paper
                        'Y' -> (2 + 0)
                        // Scissors
                        'Z' -> (3 + 3)
                        else -> throw IllegalStateException()
                    }
                }
                else -> throw IllegalStateException()
            }
        }

        return totalScore
    }

    fun part2(input: List<String>): Int {
        var totalScore = 0

        input.forEach { round ->
            when (round.first()) {
                // Rock
                'A' -> {
                    totalScore += when (round.third()) {
                        // Lose
                        'X' -> (0 + 3)
                        // Draw
                        'Y' -> (3 + 1)
                        // Win
                        'Z' -> (6 + 2)
                        else -> throw IllegalStateException()
                    }
                }
                // Paper
                'B' -> {
                    totalScore += when (round.third()) {
                        // Lose
                        'X' -> (0 + 1)
                        // Draw
                        'Y' -> (3 + 2)
                        // Win
                        'Z' -> (6 + 3)
                        else -> throw IllegalStateException()
                    }
                }
                // Scissors
                'C' -> {
                    totalScore += when (round.third()) {
                        // Lose
                        'X' -> (0 + 2)
                        // Draw
                        'Y' -> (3 + 3)
                        // Win
                        'Z' -> (6 + 1)
                        else -> throw IllegalStateException()
                    }
                }
                else -> throw IllegalStateException()
            }
        }

        return totalScore
    }

    println(part1(readInput("Day02")))
    println(part2(readInput("Day02")))
}

private fun String.third() = this[2]