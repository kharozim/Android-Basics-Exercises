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

        var etUsername = findViewById<EditText>(R.id.et_email)
        var etPassword = findViewById<EditText>(R.id.et_password)
        val btLogin = findViewById<Button>(R.id.bt_login)

        var username = etUsername.text.toString()
        var password = etPassword.text.toString()

        btLogin.setOnClickListener {

            intentTo(HomeActivity::class.java)
//            when{
//                username.isEmpty() || password.isEmpty() -> Toast.makeText(applicationContext,"email / paswd kosong", Toast.LENGTH_SHORT).show()
//                else -> intentTo(HomeActivity::class.java)
//            }
//            if (username.isEmailValid() && password.toString().isPasswordValid()) {
//                val intent = Intent(this, HomeActivity::class.java)
//                startActivity(intent)
        }
    }
}

//private fun String.isPasswordValid(): Boolean {
//    return !TextUtils.isEmpty(this) && this.matches(Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~\$^+=<>]).{8,20}\$"))
//}
//
//private fun String.isEmailValid(): Boolean {
//    return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
//}
