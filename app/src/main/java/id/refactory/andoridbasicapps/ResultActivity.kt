package id.refactory.andoridbasicapps

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.IdRes

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btBack = findViewById<Button>(R.id.bt_back)
        val etResult = findViewById<EditText>(R.id.et_resultAct)
//        val btBack = findViewById<Button>(R.id.bt_back)


        btBack.setOnClickListener {
            val data = etResult.text.toString()
//            Intent(this, SecondActivity::class.java)
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}