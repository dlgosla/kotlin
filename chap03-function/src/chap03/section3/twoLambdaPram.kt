package chap03.section3

fun main(){
    twolambda({a,b->"first $a $b"},{"second $it"})
    twolambda({a,b->"first $a $b"}){"second $it"}
}

fun twolambda(first:(String,String)->String, second:(String)->String){
    println(first("oneParam","twoParam"))
    println(second("oneParam"))

}