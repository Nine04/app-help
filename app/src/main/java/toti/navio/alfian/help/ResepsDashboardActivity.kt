package toti.navio.alfian.help

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityDashboardResepsBinding

class ResepsDashboardActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityDashboardResepsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardResepsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCrudPasienReseps.setOnClickListener(this)
        binding.btnProfilReseps.setOnClickListener(this)
        binding.btnLogoutReseps.setOnClickListener(this)
        binding.btnHistoryRekamReseps.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnCrudPasien_Reseps -> {
                val intent = Intent(this, CrudPasienActivity::class.java)
                startActivity(intent)
            }
            R.id.btnLogoutReseps -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.btnHistoryRekam_Reseps -> {
                val intent = Intent(this, ResepsHistoryRekamActivity::class.java)
                startActivity(intent)
            }
            R.id.btnProfil_Reseps -> {
                val intent = Intent(this, ResepsProfilActivity::class.java)
                startActivity(intent)
            }
        }
    }
}