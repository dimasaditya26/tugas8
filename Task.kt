package inheritance

fun main() {

    val afrig = Dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = Mahasiswa()
    andika.nama = "Andika"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = Satpam()
    budi.nama = "Budi"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 600000
    budi.bekerja()
    budi.pos = "Barat"
    budi.menjaga()

}