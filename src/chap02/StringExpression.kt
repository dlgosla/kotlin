package chap02

fun main(){
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}"

    println("str1: \"$str1\", \"$str2\"")
}