package chap03.section3

fun main(){
    shortFunc(3) {println("first call: $it")}
    shortFunc(5) {println("second call: $it")}
}

inline fun shortFunc(a:Int,out:(Int)->Unit){
    println("before calling out()")
    out(a)
    println("after calling out()")
}