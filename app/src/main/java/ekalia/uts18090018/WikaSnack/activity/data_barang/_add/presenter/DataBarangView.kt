package ekalia.uts18090018.WikaSnack.activity.data_barang.presenter

import ekalia.uts18090018.WikaSnack.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}