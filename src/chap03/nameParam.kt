package chap03

fun main(){
    nameParam(x = 200, z = 100)
    nameParam(z = 150)
}

fun nameParam(x:Int = 100, y:Int = 200, z:Int){
    println(x+y+z)
}