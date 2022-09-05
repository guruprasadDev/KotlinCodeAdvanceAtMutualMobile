fun main(){
    val arrayListInt : ArrayList<Int>  = arrayListOf<Int>(9,8,7,6)
    val arrayListString : ArrayList<String> = arrayListOf<String>("Java","Kotlin","Python")
    val arrayListAny : ArrayList<Any> = arrayListOf<Any>(1,2,3,"Guru","Prasad","Reddy")

    println("")
    println("******** ArrayListof() Int Type ********")
    for(elements in arrayListInt){
        println(elements)
    }


    println("")
    println("******** ArrayListof() String  Type ********")
    for(elements in arrayListString){
        println(elements)
    }


    println("")
    println("******** ArrayListof() Any Type ********")
    for(elements in arrayListAny){
        println(elements)
    }
}