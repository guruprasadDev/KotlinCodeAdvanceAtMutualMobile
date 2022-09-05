fun main(){

    //create a list
    val immutableList1 = listOf("Guru Prasad","Vishnu","Devaki")
    val immutableList2 = listOf(0,2,3,9,0,8,6,4,2)

    for(item in immutableList1){
        println(item)
    }
    println("")

    //List access using index integer

    println(immutableList1[1])

    println("")

    println("List : $immutableList2")

    println("")
    //sorted List

    println("Sorted : ${immutableList2.sorted()}")

}
