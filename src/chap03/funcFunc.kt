package chap03

fun main(){
    println("funcFunc: ${funcFunc()}")
}

fun sum1(a: Int, b:Int):Int = a+b

fun funcFunc():Int {
    return sum1(2,2)
}