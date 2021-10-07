open class cars(model: String, color: String, yearOfManufacture: Int) {
    init {
        println("The model is:$model")
        println("The color is:$color")
        println("The year of manufacture is:$yearOfManufacture")
    }
}

class toyota(model: String, color: String, yearOfManufacture: Int): cars(model, color, yearOfManufacture){
    fun premio(){
        println("I love premio")
    }
}

class nissan(model: String,color: String,yearOfManufacture: Int): cars(model, color, yearOfManufacture){
    fun tiida(){
        println("I love tiida")
    }
}

class mercedes(model: String,color: String,yearOfManufacture: Int): cars(model, color, yearOfManufacture){
    fun eclass(){
        println("I love Eclass")
    }
}

class rangerover(model: String, color: String,yearOfManufacture: Int): cars(model, color, yearOfManufacture){
    fun range(){
        println("I love Range")
    }
}

fun main(args: Array<String>) {
    val to = toyota("Allion","Grey", 2010)
    to.premio()
    val dualis = nissan("Dualis", "Brown", 2009)
    dualis.tiida()
}