package toti.navio.alfian.help

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import toti.navio.alfian.help.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var b : ActivityLoginBinding

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnLogin.setOnClickListener(View.OnClickListener {
            if (b.emailLogin.text.toString() == "user" && b.passwordLogin.text.toString() == "1234"){
                val intent = Intent(this, ResepsDashboardActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
    }


}