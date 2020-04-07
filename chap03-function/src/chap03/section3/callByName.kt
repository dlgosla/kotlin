package chap03.section3

fun main(){
    val result = callByname(otherLambda)
    print(result)
}

fun callByname(a:()->Boolean):Boolean{
    return a()
}

val otherLambda: (()->Boolean)={true}