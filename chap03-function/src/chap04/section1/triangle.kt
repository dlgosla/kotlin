package chap04.section1

fun main(){
    print("enter line")
    val n = readLine()!!.toInt()

    for (line in 1..n){
        for(space in 1..(n-line)) print(" ")
        for (star in 1..(2*line -1)) print("*")
        println()
    }
}