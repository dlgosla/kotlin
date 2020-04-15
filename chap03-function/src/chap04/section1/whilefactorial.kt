package chap04.section1

fun main(){
    print("enter the number: ")
    var n = readLine()!!.toInt()
    var factorial = 1

    while(n>0){
        factorial *= n
        --n
    }
    println(factorial)
}