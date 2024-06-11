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
import toti.navio.alfian.help.model.DokterResponse

class CrudDokterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCruddokterBinding
    private lateinit var adapter: AdapterDokter
    private val apiService: ApiService by lazy {
        RetrofitClient.apiService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCruddokterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi AdapterDokter dan terapkan pada RecyclerView
        adapter = AdapterDokter(this, emptyList())
        binding.RcCrudDokterAdmin.layoutManager = LinearLayoutManager(this)
        binding.RcCrudDokterAdmin.adapter = adapter

        // Panggil fungsi untuk memuat data dari API
        loadDataFromApi()
    }

    private fun loadDataFromApi() {
        // Mendapatkan data dari API menggunakan Retrofit
        apiService.getDokters().enqueue(object : Callback<DokterResponse> {
            override fun onResponse(call: Call<DokterResponse>, response: Response<DokterResponse>) {
                if (response.isSuccessful) {
                    val dokterResponse = response.body()
                    dokterResponse?.let {
                        if (it.success) {
                            // Jika response sukses dan success field true, setel data ke dalam adapter
                            adapter.setData(it.data)

                            // Menampilkan log data
                            for (dokter in it.data) {
                                Log.d("DokterData", "ID: ${dokter.id_dokter}, Name: ${dokter.name}, Email: ${dokter.email}")
                            }
                        } else {
                            // Jika response sukses tetapi success field false, tampilkan pesan kesalahan
                            Log.e("DokterResponse", "Response message: ${it.message}")
                        }
                    }
                } else {
                    // Jika response gagal, tampilkan pesan kesalahan
                    Log.e("DokterResponse", "Failed to get dokters. Error code: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<DokterResponse>, t: Throwable) {
                // Jika terjadi kegagalan saat melakukan request ke API, tampilkan pesan kesalahan
                Log.e("DokterResponse", "Failed to get dokters. Error message: ${t.message}")
            }
        })
    }


}
