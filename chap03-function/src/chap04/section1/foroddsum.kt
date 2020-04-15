package chap04.section1

fun main(){
    var total :Int = 0

    for(i in 1..100 step 2) total += i
    println("odd total: $total")
}