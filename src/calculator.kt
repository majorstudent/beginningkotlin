fun main(args: Array<String>) {
    print("Enter First Number: ")
    var num1 = Integer.valueOf(readLine())
    print("Enter Operator: ")
    var op = readLine()
    print("Enter Second Number: ")
    var num2 = Integer.valueOf(readLine())

    if (op == "+"){
        println("Result: " + (num1 + num2))
    } else if (op == "-"){
        println("Result: " + (num1 - num2))
    } else if (op == "*"){
        println("Result: " + (num1 * num2))
    } else if (op == "/"){
        println("Result: " + (num1 / num2))
    } else {
        println("Invalid input!")
    }

}