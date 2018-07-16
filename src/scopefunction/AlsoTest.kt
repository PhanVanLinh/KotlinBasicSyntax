package scopefunction

class AlsoTest {
    var a : String? = ""

    fun funtion(){

        a = a?.also {

        }

        a?.let {

        }

        run{
            funtion()
        }
    }
}