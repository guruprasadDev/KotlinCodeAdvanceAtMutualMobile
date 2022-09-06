
fun main(){

    val hashMap :HashMap<Int,String> = HashMap<Int,String>()

    hashMap[101] = "Hi"
    hashMap[102] = "Hello"
    hashMap[103] = "How are you"
    hashMap[104] = "What are you doing"


    println("")
    for(element in hashMap){
        println(element)
    }

    val hashMap1 : HashMap<String,String> = HashMap(4)

    hashMap1.put("name", "E.Guru Prasad Reddy")
    hashMap1.put("City","Chittoor")
    hashMap1.put("Department","Android App Developer")
    hashMap1.put("Company","MutualMobile Pvt Ltd")

    println("")

    for(element in hashMap1.keys){
        println("Element at Key $element = ${hashMap1[element]}")
    }
}