package toti.navio.alfian.help

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import toti.navio.alfian.help.model.Diagnosa

class AdapterDiagnosa(private val context: Context, private var diagnosaList: List<Diagnosa>) : RecyclerView.Adapter<AdapterDiagnosa.DiagnosaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiagnosaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_diagnosa, parent, false)
        return DiagnosaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiagnosaViewHolder, position: Int) {
        val diagnosa = diagnosaList[position]
        holder.nameTextView.text = diagnosa.nama_diagnosa

        // Implementasi gambar jika ada
        // Picasso.get().load(dokter.img).into(holder.imgImageView)
    }

    override fun getItemCount(): Int {
        return diagnosaList.size
    }

    fun setData(newList: List<Diagnosa>) {
        diagnosaList = newList
        notifyDataSetChanged()
    }

    inner class DiagnosaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.tx_nama_diagnosa_row)
        // Tambahkan ImageView jika perlu
        // val imgImageView: ImageView = itemView.findViewById(R.id.img_diagnosa_row)
    }
}
