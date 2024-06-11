package toti.navio.alfian.help

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityProfilAdminBinding

class AdminProfilActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfilAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}