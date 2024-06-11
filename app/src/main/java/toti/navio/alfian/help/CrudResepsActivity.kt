package toti.navio.alfian.help

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import toti.navio.alfian.help.databinding.ActivityCruddokterBinding
import toti.navio.alfian.help.database.ApiService
import toti.navio.alfian.help.database.RetrofitClient
import toti.navio.alfian.help.model.ResepsionisResponse

class CrudResepsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCruddokterBinding
    private lateinit var adapter: AdapterReseps
    private val apiService: ApiService by lazy {
        RetrofitClient.apiService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCruddokterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi AdapterResepsionis dan terapkan pada RecyclerView
        adapter = AdapterReseps(this, emptyList())
        binding.RcCrudDokterAdmin.layoutManager = LinearLayoutManager(this)
        binding.RcCrudDokterAdmin.adapter = adapter

        // Panggil fungsi untuk memuat data dari API
        loadDataFromApi()
    }

    private fun loadDataFromApi() {
        // Mendapatkan data dari API menggunakan Retrofit
        apiService.getResepsionis().enqueue(object : Callback<ResepsionisResponse> {
            override fun onResponse(call: Call<ResepsionisResponse>, response: Response<ResepsionisResponse>) {
                if (response.isSuccessful) {
                    val resepsionisResponse = response.body()
                    resepsionisResponse?.let {
                        if (it.success) {
                            // Jika response sukses dan success field true, setel data ke dalam adapter
                            adapter.setData(it.data)

                            // Menampilkan log data
                            for (resepsionis in it.data) {
                                Log.d("ResepsionisData", "ID: ${resepsionis.id_resepsionis}, Name: ${resepsionis.name}, Email: ${resepsionis.email}")
                            }
                        } else {
                            // Jika response sukses tetapi success field false, tampilkan pesan kesalahan
                            Log.e("ResepsionisResponse", "Response message: ${it.message}")
                        }
                    }
                } else {
                    // Jika response gagal, tampilkan pesan kesalahan
                    Log.e("ResepsionisResponse", "Failed to get resepsionis. Error code: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ResepsionisResponse>, t: Throwable) {
                // Jika terjadi kegagalan saat melakukan request ke API, tampilkan pesan kesalahan
                Log.e("ResepsionisResponse", "Failed to get resepsionis. Error message: ${t.message}")
            }
        })
    }


}
