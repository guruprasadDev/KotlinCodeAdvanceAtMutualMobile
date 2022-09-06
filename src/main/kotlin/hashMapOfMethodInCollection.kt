fun main(){
    val hashMapOfInt : HashMap<Int,String> = hashMapOf<Int,String>(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        5 to "Five")

    val hashMapOfStr : HashMap<String,String> = hashMapOf()

    hashMapOfStr.put("Name","Guru Prasad")
    hashMapOfStr.put("Course","Android")
    hashMapOfStr.put("Phone Number","7995674395")

    val hashMapOfAny : HashMap<Any,Any> = hashMapOf()

    hashMapOfAny.put(11,"Eleven")
    hashMapOfAny.put(15,"FiftyTeen")
    hashMapOfAny.put("Sixteen",16)
    hashMapOfAny.put("Seventeen",17)


    println("******* Traversal of hashMapOf() Int Type ********")
    for(element in hashMapOfInt.keys)
    {
        println("Element at key $element : ${hashMapOfInt[element]}")
    }

    println("******* Traversal of hashMapOf() String Type ********")
    for(element in hashMapOfStr.keys)
    {
        println("Element at key $element = ${hashMapOfStr[element]}")
    }

    println("******* Traversal of hashMapOf() Any Type ********")
    for(element in hashMapOfAny.keys)
    {
        println("Element at key $element : ${hashMapOfAny[element]}")
    }





}