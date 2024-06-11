package toti.navio.alfian.help

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import toti.navio.alfian.help.model.Pasien

class AdapterPasien(private val context: Context, private var pasienList: List<Pasien>) : RecyclerView.Adapter<AdapterPasien.PasienViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasienViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_pasien, parent, false)
        return PasienViewHolder(view)
    }

    override fun onBindViewHolder(holder: PasienViewHolder, position: Int) {
        val pasien = pasienList[position]
        holder.nameTextView.text = pasien.name
        holder.emailTextView.text = pasien.email
        holder.alamatTextView.text = pasien.alamat
        holder.noHpTextView.text = pasien.noHp
        holder.goldarTextView.text = pasien.goldar
        holder.tensiTextView.text = pasien.tensi
        holder.ekgTextView.text = pasien.ekg
        holder.tinggiTextView.text = pasien.tinggi
        holder.beratTextView.text = pasien.berat
        holder.penyakitBawaanTextView.text = pasien.penyakitBawaan

        Picasso.get().load(pasien.img).into(holder.imgImageView)
    }

    override fun getItemCount(): Int {
        return pasienList.size
    }

    fun setData(newList: List<Pasien>) {
        pasienList = newList
        notifyDataSetChanged()
    }

    inner class PasienViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.tx_nama_pasien_row)
        val emailTextView: TextView = itemView.findViewById(R.id.tx_email_pasien_row)
        val alamatTextView: TextView = itemView.findViewById(R.id.tx_alamat_pasien_row)
        val noHpTextView: TextView = itemView.findViewById(R.id.tx_hp_pasien_row)
        val goldarTextView: TextView = itemView.findViewById(R.id.tx_goldar_pasien_row)
        val tensiTextView: TextView = itemView.findViewById(R.id.tx_tensi_pasien_row)
        val ekgTextView: TextView = itemView.findViewById(R.id.tx_ekg_pasien_row)
        val tinggiTextView: TextView = itemView.findViewById(R.id.tx_tinggi_pasien_row)
        val beratTextView: TextView = itemView.findViewById(R.id.tx_berat_pasien_row)
        val penyakitBawaanTextView: TextView = itemView.findViewById(R.id.tx_penyakit_bawaan_pasien_row)
        val imgImageView: ImageView = itemView.findViewById(R.id.img_pasien_row)
    }
}
