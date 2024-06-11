package toti.navio.alfian.help

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import toti.navio.alfian.help.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var b : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}