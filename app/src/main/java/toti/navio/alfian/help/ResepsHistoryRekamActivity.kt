package toti.navio.alfian.help

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityHistoryrekamBinding

class ResepsHistoryRekamActivity : AppCompatActivity() {
    lateinit var binding: ActivityHistoryrekamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryrekamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}