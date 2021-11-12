package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var rez= mutableListOf<String>()

        var i = 0
        var txt = ""

        while (i < inputString.length-1){
            when (inputString[i]){
                '<' -> txt = getSubString(inputString,'<','>', i);

                '[' -> txt = getSubString(inputString,'[',']', i)
                '(' -> txt = getSubString(inputString,'(',')', i)
            }
            if (txt.isNotEmpty()){
                rez.add(txt)
            }
            txt = ""
            i++
        }

        return rez.toTypedArray()
    }

    fun getSubString(inpString: String, firstChar: Char, lastChar: Char, index: Int): String{
        var rez = ""
        var flag = 1
        var i = index + 1

        while (flag > 0 && i < inpString.length){
            when(inpString[i]){
                firstChar -> flag++
                lastChar -> flag--
            }
            if (flag == 0){
                rez = inpString.substring(index + 1, i)
            }
            else
                i++
        }

        return rez
    }

}
