package inheritance

class Satpam : Karyawan() {
    var pos: String = ""

    fun menjaga() {
        println("Saya menjaga di pos $pos")
    }
}