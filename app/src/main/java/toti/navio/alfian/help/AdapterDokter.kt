package toti.navio.alfian.help

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import toti.navio.alfian.help.model.Dokter

class AdapterDokter(private val context: Context, private var dokterList: List<Dokter>) : RecyclerView.Adapter<AdapterDokter.DokterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DokterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_dokter, parent, false)
        return DokterViewHolder(view)
    }

    override fun onBindViewHolder(holder: DokterViewHolder, position: Int) {
        val dokter = dokterList[position]
        holder.nameTextView.text = dokter.name
        holder.emailTextView.text = dokter.email
        holder.noHpTextView.text = dokter.no_hp
        holder.spesialisTextView.text = dokter.spesialis

        Picasso.get().load(dokter.img).into(holder.imgImageView)
    }

    override fun getItemCount(): Int {
        return dokterList.size
    }

    fun setData(newList: List<Dokter>) {
        dokterList = newList
        notifyDataSetChanged()
    }

    inner class DokterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.tx_nama_dokter_row)
        val emailTextView: TextView = itemView.findViewById(R.id.tx_email_dokter_row)
        val noHpTextView: TextView = itemView.findViewById(R.id.tx_hp_dokter_row)
        val spesialisTextView: TextView = itemView.findViewById(R.id.tx_spesialis_dokter_row)
        val imgImageView: ImageView = itemView.findViewById(R.id.img_dokter_row)
    }
}
