package chap03.section5

fun main(){
    val number = 4
    val result :Long

    result = factorial(number)
    println("factorial: $number -> $result")

}

tailrec fun factorial(n:Int, run:Int = 1):Long{
    return if(n==1) n.toLong() else factorial(n-1,run*n)
}