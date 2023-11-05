package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6)
    }

    fun calculateMatchCount(luckyNumbers: List<Int>): Int {
        var count = 0

        luckyNumbers.forEach { number ->
            if (numbers.contains(number)) count++
        }

        return count
    }
}
