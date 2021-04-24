package ekalia.uts18090018.WikaSnack.activity.data_barang.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import ekalia.uts18090018.WikaSnack.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultDataBarang(

    @field:SerializedName("barang")
	val barang: List<Barang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)