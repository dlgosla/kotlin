package chap04.section2

fun main(){
    refunc1()
}

fun inlineLambda1(a:Int, b:Int, out: (Int,Int)-> Unit){
    out(a,b)
}

fun refunc1() {
    println("start")
    inlineLambda1(13,3){a,b ->
        val result = a + b
        if(result>10)
            return@inlineLambda1
        println("result: $result")
    }
    println("end")
}