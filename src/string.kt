fun main() {

    var namaDepan: String = "Dea"
    println(namaDepan)

    var namaBelakang: String = "Sunara"
    println(namaBelakang)

    var alamat: String = """Kp.Rancagoong Rt 03 Rw 08 kec.gegerebitung desa.gegerbitung""".trimMargin()
    println(alamat)

    var namaLengkap: String = "$namaDepan $namaBelakang"
    println(namaLengkap)

    var desc: String ="$namaLengkap length = ${namaLengkap.length}"
    println(desc)
}