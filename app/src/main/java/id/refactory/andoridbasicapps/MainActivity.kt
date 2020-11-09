package id.refactory.andoridbasicapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val btGotoFirstActivity = findViewById<Button>(R.id.bt_gotoFirstAct)
        btGotoFirstActivity.setOnClickListener{
            val intent = Intent(this@MainActivity, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}