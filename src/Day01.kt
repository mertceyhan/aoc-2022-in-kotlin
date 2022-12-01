fun main() {

    fun getTotalCaloriesByOrder(input: List<String>): List<Int> {
        val totalCalories = mutableListOf<Int>()
        var currentTotalCalorie = 0

        input.forEachIndexed { index, string ->
            if (string != "") {
                currentTotalCalorie += string.toInt()
            } else {
                totalCalories.add(currentTotalCalorie)
                currentTotalCalorie = 0
            }

            if (index == input.lastIndex) {
                totalCalories.add(currentTotalCalorie)
                currentTotalCalorie = 0
            }
        }

        totalCalories.sortDescending()

        return totalCalories
    }

    fun part1(input: List<String>): Int {
        return getTotalCaloriesByOrder(input).first()
    }

    fun part2(input: List<String>): Int {
        return getTotalCaloriesByOrder(input).subList(0, 3).sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
