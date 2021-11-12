package subtask1

import kotlin.collections.MutableList as MutableList


class HappyArray {


    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray.toMutableList()
        var i: Int = 0
        var n: Int = happyArray.size

        while(i<(n-2)){
            if (happyArray[i+1]>(happyArray[i] + happyArray[i+2])){
                happyArray.removeAt(i+1)
                if (i>0) {
                    i--
                }
                n--
            }else
                i++
        }

        return happyArray.toIntArray()
    }

}
