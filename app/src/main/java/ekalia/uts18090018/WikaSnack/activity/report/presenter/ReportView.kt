package ekalia.uts18090018.WikaSnack.activity.report.presenter

import ekalia.uts18090018.WikaSnack.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}