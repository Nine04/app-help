package toti.navio.alfian.help.model

import com.google.gson.annotations.SerializedName

data class Rekam(
    @SerializedName("id_rekam")
    val idRekam: Int,
    @SerializedName("dokter_id")
    val dokterId: Int,
    @SerializedName("pasien_id")
    val pasienId: Int,
    @SerializedName("diagnosa_id")
    val diagnosaId: Int,
    val keluhan: String,
    val arahan: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)
