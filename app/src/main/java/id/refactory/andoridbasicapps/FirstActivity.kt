package id.refactory.andoridbasicapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val etFirstAct = findViewById<EditText>(R.id.et_firstAct)
        val btGotoDetail = findViewById<Button>(R.id.bt_gotoDetail)
        btGotoDetail.setOnClickListener {

            val text = etFirstAct.text.toString()

            val intent = Intent(this@FirstActivity, DetailActivity::class.java)
            intent.putExtra("text", text)
            startActivity(intent)
        }


    }
}