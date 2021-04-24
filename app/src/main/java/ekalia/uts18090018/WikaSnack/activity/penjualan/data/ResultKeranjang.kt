package ekalia.uts18090018.WikaSnack.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import ekalia.uts18090018.WikaSnack.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)