package id.refactory.andoridbasicapps

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val btResult = findViewById<Button>(R.id.bt_result)
        btResult.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
//            intentTo(this,ResultActivity::class.java)
        }
    }



//    private fun intentTo(context: Context, cls: Class<?>) {
//        startActivity(Intent(context, cls))
//    }
}