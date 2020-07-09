package chap03

fun main(){
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: ()->Boolean): Boolean {
    println("callByName function")
    return b()
}

val otherLambda:()->Boolean = {
    println("otherLambda function")
    true
}