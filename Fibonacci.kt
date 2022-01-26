//Fibonacci Sequence with n elements (Kotlin)

fun main(){
    //Get N
    println("N: ")
    var n = readLine()!!.toInt()

    var num1 = 1
    var num2 = 0
    var sum = 0
    var fib = arrayListOf<Int>()

    for (i in 1..n){
        fib.add(num1)

        sum = num1 + num2
        num2 = num1
        num1 = sum
    }

    //Print Fibonacci Sequence
    println(fib)
}

//easy as that :D Happy coding!!







