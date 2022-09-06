fun main(){
     val num = listOf(0,2,88,7,6,55,44,3,0,0,2,2)

    val setOfNum = num.toSet()

    println(setOfNum)

    val set1 = setOf(100,200,300,400,500,600)
    val set2 = mutableSetOf(100,200,300,400,500,600)
    val set3 = setOf("Guru Prasad Reddy","Android App Developer")

    println(set3)

    println("$set1 == $set2 : ${set1 == set2}")

    println("Contains 7 :- ${setOfNum.contains(99)}")

}