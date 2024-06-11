package toti.navio.alfian.help

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityDashboardAdminBinding

class AdminDashboardActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var b : ActivityDashboardAdminBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDashboardAdminBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.btnProfilAdmin.setOnClickListener(this)
        b.btnLogoutAdmin.setOnClickListener(this)
        b.btnCrudRekamAdmin.setOnClickListener(this)
        b.btnCrudDokterAdmin.setOnClickListener(this)
        b.btnCrudPasienAdmin.setOnClickListener(this)
        b.btnCrudResepsAdmin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnLogoutAdmin -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCrudDokter_Admin -> {
                val intent = Intent(this, CrudDokterActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCrudRekam_Admin -> {
                val intent = Intent(this, CrudRekamActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCrudPasien_Admin -> {
                val intent = Intent(this, CrudPasienActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCrudReseps_Admin -> {
                val intent = Intent(this, CrudResepsActivity::class.java)
                startActivity(intent)
            }
            R.id.btnProfil_Admin -> {
                val intent = Intent(this, AdminProfilActivity::class.java)
                startActivity(intent)
            }
        }
    }
}


