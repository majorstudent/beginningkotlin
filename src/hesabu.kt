class hesabu {
    //Data member

    private var nambari1: Double = 23.45
    private var nambari2: Double = 67.54

    //Member function

    fun zidisha():Double{
        return nambari1*nambari2
    }

}

fun main(args: Array<String>) {
    //create an object

    val obj = hesabu()
    println(obj.zidisha())

}