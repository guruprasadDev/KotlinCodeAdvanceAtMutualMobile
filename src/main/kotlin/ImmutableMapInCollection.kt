fun main(){
    val immutableMap = mapOf<Int,String>(
        1 to "E.Guru Prasad",
        2 to "A.Vishnu Priya",
        3 to "E.Devaki",
        4 to "E.Harinath Reddy",
        5 to "E.Sai kumar")

    for(family in immutableMap){
        println(family)
        println(family.value)

    }
}