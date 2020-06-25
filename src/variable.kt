const val Application = "belajar kotlin"
const val  Version ="0.10"

fun main() {

    val namaDepan:String= "Dea"
    val age = 30L

    println(namaDepan.length)
    println(age)

    val name: String? = null
    println(name?.length)

    println("$Application : $Version")

}