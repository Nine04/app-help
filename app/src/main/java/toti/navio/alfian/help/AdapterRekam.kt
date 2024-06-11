package toti.navio.alfian.help

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import toti.navio.alfian.help.model.Rekam

class AdapterRekam(private val context: Context, private var rekamList: List<Rekam>) : RecyclerView.Adapter<AdapterRekam.RekamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RekamViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_rekam, parent, false)
        return RekamViewHolder(view)
    }

    override fun onBindViewHolder(holder: RekamViewHolder, position: Int) {
        val rekam = rekamList[position]
        holder.bind(rekam)
    }

    override fun getItemCount(): Int {
        return rekamList.size
    }

    fun setData(newList: List<Rekam>) {
        rekamList = newList
        notifyDataSetChanged()
    }

    inner class RekamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val idTextView: TextView = itemView.findViewById(R.id.tx_id_rekam_row)
        private val pasienTextView: TextView = itemView.findViewById(R.id.tx_pasien_rekam_row)
        private val dokterTextView: TextView = itemView.findViewById(R.id.tx_dokter_rekam_row)
        private val keluhanTextView: TextView = itemView.findViewById(R.id.tx_keluhan_rekam_row)
        private val diagnosaTextView: TextView = itemView.findViewById(R.id.tx_diagnosa_rekam_row)
        private val arahanTextView: TextView = itemView.findViewById(R.id.tx_arahan_rekam_row)

        fun bind(rekam: Rekam) {
            idTextView.text = rekam.idRekam.toString()
            pasienTextView.text = rekam.pasienId.toString()
            dokterTextView.text = rekam.dokterId.toString()
            keluhanTextView.text = rekam.keluhan
            diagnosaTextView.text = "Diagnosa"
            arahanTextView.text = rekam.arahan
        }
    }
}
