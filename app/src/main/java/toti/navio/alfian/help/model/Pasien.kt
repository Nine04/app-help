package toti.navio.alfian.help.model

import com.google.gson.annotations.SerializedName

data class Pasien(
    @SerializedName("id")
    val id_pasien: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("alamat")
    val alamat: String,
    @SerializedName("no_hp")
    val noHp: String,
    @SerializedName("goldar")
    val goldar: String,
    @SerializedName("tensi")
    val tensi: String,
    @SerializedName("ekg")
    val ekg: String,
    @SerializedName("tinggi")
    val tinggi: String,
    @SerializedName("berat")
    val berat: String,
    @SerializedName("penyakit_bawaan")
    val penyakitBawaan: String,
    @SerializedName("img")
    val img: String
)
