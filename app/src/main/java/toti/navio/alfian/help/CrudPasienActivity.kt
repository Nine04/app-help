package toti.navio.alfian.help

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import toti.navio.alfian.help.databinding.ActivityCrudpasienBinding
import toti.navio.alfian.help.database.ApiService
import toti.navio.alfian.help.database.RetrofitClient
import toti.navio.alfian.help.model.PasienResponse

class CrudPasienActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCrudpasienBinding
    private lateinit var adapter: AdapterPasien
    private val apiService: ApiService by lazy {
        RetrofitClient.apiService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudpasienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize AdapterPasien and set it to RecyclerView
        adapter = AdapterPasien(this, emptyList())
        binding.RcCrudPasienAdmin.layoutManager = LinearLayoutManager(this)
        binding.RcCrudPasienAdmin.adapter = adapter

        // Call function to load data from API
        loadDataFromApi()
    }

    private fun loadDataFromApi() {
        // Fetch data from API using Retrofit
        apiService.getPasiens().enqueue(object : Callback<PasienResponse> {
            override fun onResponse(call: Call<PasienResponse>, response: Response<PasienResponse>) {
                if (response.isSuccessful) {
                    val pasienResponse = response.body()
                    pasienResponse?.let {
                        if (it.success) {
                            // If response is successful and success field is true, set data to the adapter
                            adapter.setData(it.data)

                            // Display log data
                            for (pasien in it.data) {
                                Log.d("PasienData", "ID: ${pasien.id_pasien}, Name: ${pasien.name}, Email: ${pasien.email}")
                            }
                        } else {
                            // If response is successful but success field is false, display error message
                            Log.e("PasienResponse", "Response message: ${it.message}")
                        }
                    }
                } else {
                    // If response is unsuccessful, display error message
                    Log.e("PasienResponse", "Failed to get patients. Error code: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<PasienResponse>, t: Throwable) {
                // If request to API fails, display error message
                Log.e("PasienResponse", "Failed to get patients. Error message: ${t.message}")
            }
        })
    }
}
