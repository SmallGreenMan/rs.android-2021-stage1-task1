package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var i: Int
        var summ: Int = 0
        for (i in 0..bill.size-1){
            if (i != k) summ += bill[i]
        }
        summ = summ/2

        if (summ == b) return "Bon Appetit"
        else return (b - summ).toString()

    }
}
