package chap03

fun main(){
    normalVararg(1,2,3,4)
    normalVararg(4,5,6)
}

fun normalVararg(vararg counts: Int){
    for(num in counts){
        print("$num ")
    }
    println()
}
