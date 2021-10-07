class majina(var jina: String, var jinsia: String, val miaka: Int) {
}

fun main(args: Array<String>) {
    var names = majina("Reinhard", "Male", 20)
    println("My name is ${names.jina}")
    println("My gender is ${names.jinsia}")
    println("My age is ${names.miaka}")
}