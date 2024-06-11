package toti.navio.alfian.help.model

import com.google.gson.annotations.SerializedName

data class ResepsionisResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: List<Resepsionis>
)
