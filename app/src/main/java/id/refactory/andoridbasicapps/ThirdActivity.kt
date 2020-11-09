package id.refactory.andoridbasicapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ThirdActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val etUsername = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btLogin = findViewById<Button>(R.id.bt_login)

        btLogin.setOnClickListener {
            when {
                etUsername.text.toString().isEmailValid() && etPassword.text.toString().isPasswordValid() -> {
                    intentTo(HomeActivity::class.java)
                }
                etPassword.text.toString().length <= 8 -> {
                    etPassword.text.clear()
                    etPassword.setError("minimum password 8 character")
                }
            }
        }
    }


    private fun String.isPasswordValid(): Boolean {
        return !TextUtils.isEmpty(this) && this.matches(Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~\$^+=<>]).{8,20}\$"))
    }

    private fun String.isEmailValid(): Boolean {
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this)
            .matches()
    }
}