package toti.navio.alfian.help

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import toti.navio.alfian.help.databinding.ActivityProfilResepsBinding

class ResepsProfilActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityProfilResepsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilResepsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}