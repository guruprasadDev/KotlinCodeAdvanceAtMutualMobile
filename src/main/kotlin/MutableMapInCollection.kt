fun main() {

    val mutableMap1: MutableMap<Int, String> = mutableMapOf<Int, String>(1 to "guru", 4 to "Bhanu", 2 to "Sai", 3 to "Vijay")

    val mutableMap2: MutableMap<String, String> = mutableMapOf<String, String>()
    mutableMap2.put("name", "E.Guru Prasad Reddy")
    mutableMap2.put("city", "Chittoor")
    mutableMap2.put("department", "Android App Developer")
    mutableMap2.put("hobby", "Playing Cricket")
    val mutableMap3: MutableMap<Any, Any> = mutableMapOf<Any, Any>(1 to "guru", "name" to "Sai", 2 to 200)
    println(".....traverse mutableMap1........")
    for (key in mutableMap1.keys) {
        println("Key = ${key}, Value = ${mutableMap1[key]}")
    }
    println("......traverse mutableMap2.......")
    for (key in mutableMap2.keys) {
        println("Key = "+key +", "+"Value = "+mutableMap2[key])
    }
    println("......traverse mutableMap3......")
    for (key in mutableMap3.keys) {
        println("Key = ${key}, Value = ${mutableMap3[key]}")
    }
}