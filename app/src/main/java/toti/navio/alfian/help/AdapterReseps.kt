package toti.navio.alfian.help

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import toti.navio.alfian.help.model.Resepsionis

class AdapterReseps(private val context: Context, private var resepsionisList: List<Resepsionis>) : RecyclerView.Adapter<AdapterReseps.ResepsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResepsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_reseps, parent, false)
        return ResepsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResepsViewHolder, position: Int) {
        val resepsionis = resepsionisList[position]
        holder.nameTextView.text = resepsionis.name
        holder.emailTextView.text = resepsionis.email
        holder.noHpTextView.text = resepsionis.no_hp

        Picasso.get().load(resepsionis.img).into(holder.imgImageView)
    }

    override fun getItemCount(): Int {
        return resepsionisList.size
    }

    fun setData(newList: List<Resepsionis>) {
        resepsionisList = newList
        notifyDataSetChanged()
    }

    inner class ResepsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.tx_nama_reseps_row)
        val emailTextView: TextView = itemView.findViewById(R.id.tx_email_reseps_row)
        val noHpTextView: TextView = itemView.findViewById(R.id.tx_hp_reseps_row)
        val imgImageView: ImageView = itemView.findViewById(R.id.img_reseps_row)
    }
}
