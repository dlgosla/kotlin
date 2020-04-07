package chap03.section3

fun main(){
    val result = callByvalue(lambda())
    println(result)
}

fun callByvalue(a: Boolean): Boolean {
    println("callByValue function")
    return a
}

val lambda:()->Boolean = {
    println("lambda function")
    true
}