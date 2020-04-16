package chap04.section2

fun main(){
    reFunc()

}

inline fun inlineLambda(a:Int, b:Int, out:(Int,Int)->Unit){
    out(a,b)
}

fun reFunc(){
    println("start of retFunc")
    inlineLambda(13,3) { a, b ->
        val result = a+b
        if(result>10)
            return
        println("result: $result")
    }
    println("end of reFunc")
}