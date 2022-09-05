fun main(){
    val arrayListInt = ArrayList<Int>()

    arrayListInt.add(3)
    arrayListInt.add(4)
    arrayListInt.add(9)
    arrayListInt.add(10)


    for(items in arrayListInt){
        println(items)
    }

    println("****** Printing Array List  Int Type ******")
    println("Size of array list Int = "+arrayListInt.size)
    println("get function in array list "+arrayListInt.get(2))
    println("set function in array List "+arrayListInt.set(3,20))
    println("IndexOf function "+arrayListInt.indexOf(3))
    println("last IndexOf function "+arrayListInt.lastIndexOf(20))

    arrayListInt.removeAt(2)



    println("")

    val arrayListString = ArrayList<String>()


    arrayListString.add("T.Harsha vardhan Reddy")
    arrayListString.add("E.Guru Prasad Reddy")
    arrayListString.add("E.Sai kumar Reddy")
    arrayListString.add("T.Teja")


    for(items in arrayListString){
        println(items)
    }


    println("****** Printing Array List  String Type ******")
    println("Size of array list String = "+arrayListString.size)
    println("get function in array list "+arrayListString.get(1))
    println("set function in array List "+arrayListString.set(2,"Sai Kumar"))
    println("IndexOf function "+arrayListString.indexOf("Sai Kumar"))
    println("last IndexOf function "+arrayListString.lastIndexOf("Sai Kumar"))

    arrayListString.removeAt(2)

}



