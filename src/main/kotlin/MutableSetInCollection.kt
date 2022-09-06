fun main() {
    val intmutableSet = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)
    val mutableSet: MutableSet<Int> = mutableSetOf<Int>(6,8,11,22)

    println("....intmutableSet....")
    for(element in intmutableSet){
        println(element)
    }
    intmutableSet.add(10)
    println("....intmutableSet.add(10)....")
    for(element in intmutableSet){
        println(element)
    }

    intmutableSet.addAll(mutableSet)
    println("....intmutableSet.addAll(mutableSet)....")
    for(element in intmutableSet){
        println(element)
    }
}
