package toti.navio.alfian.help

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityCrudrekamBinding

class CrudRekamActivity : AppCompatActivity() {
    lateinit var binding: ActivityCrudrekamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudrekamBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}