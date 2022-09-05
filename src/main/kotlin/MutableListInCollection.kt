fun main(){

    val mutableInt : MutableList<Int> = mutableListOf<Int>()
    val mutableString : MutableList<String> = mutableListOf<String>()
    val mutableAny : MutableList<Any> = mutableListOf<Any>()

    mutableInt.add(3)
    mutableInt.add(5)
    mutableInt.add(10)
    mutableInt.add(30)
    mutableInt.add(34)

    mutableString.add("Telugu")
    mutableString.add("Hindi")
    mutableString.add("English")
    mutableString.add("Maths")
    mutableString.add("Science")
    mutableString.add("Social")

    mutableAny.add(79956)
    mutableAny.add(74395)
    mutableAny.add("Guru Reddy")
    mutableAny.add("Vishnu Priya")

    println("****** Printing Int Type ******")

    for(element in mutableInt){
        println(element)
    }
    println("****** Printing String Type ******")

    for(element in mutableString){
        println(element)
    }
    println("****** Printing Any Type ******")

    for(element in mutableAny){
        println(element)
    }
}