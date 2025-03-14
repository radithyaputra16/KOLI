fun main () {
    Clubsains ()
    Anggotatim ()
}
fun Clubsains () {
    println("Astronomi")
}
fun Anggotatim () {
    var Anggota = mutableMapOf(  //Menuliskan "key" lalu masukkan "Value" sehingga jika "key" dipanggil akan menghasilkan output "Value
        "1" to "Ashila",
        "2" to "Nofsry",
        "3" to "Eidasfa",
        "4" to "Radithya",
        "5" to "Naisa"
    )
    println(Anggota)
}
fun Materi () {
    var Mater = mutableSetOf("Galaktik")
    println(Mater)
}