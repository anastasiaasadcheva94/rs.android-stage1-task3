package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        //throw NotImplementedError("Not implemented")
        var i = 0
        var y = numbers.size
        var res = ""
        var answer = arrayListOf<String>()

        while (i < numbers.size-1) {
                if (numbers[i] == 0) {
                    res = ""
                    answer.add(res)
                    i++
                    y--
                }
                if (numbers[i] == 1 || numbers[i] == -1) {
                    res = "x"
                    answer.add(res)
                    val sign = if (numbers[i+1] < 0) " - " else " + "
                    answer.add(sign)
                    i++
                    y--
                }
                if (i == numbers.size-1) {
                    res=numbers[i].toString()
                    answer.add(res)
                }else {
                        res = "${Math.abs(numbers[i])}x^${y-1}"
                        answer.add(res)
                        val sign = if (numbers[i+1] < 0) " - " else " + "
                        answer.add(sign)
                        i++
                        y--
                    }
            }
        if (numbers.isEmpty()) {
            return null
        }
        return answer.joinToString ("")
    }
}