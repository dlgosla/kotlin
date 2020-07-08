package chap02

fun main(){
    checkArg("hello")
    checkArg(5)
}

fun checkArg(x: Any){
    if(x is String){
        println("x is String: $x")
    }

    if(x is Int){
        println("x is Int: $x")
    }
}