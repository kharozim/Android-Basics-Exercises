package id.refactory.andoridbasicapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import id.refactory.andoridbasicapps.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //get data from intent
        val text = intent.getStringExtra("text")

        //settext
        val tvDetailAct = findViewById<TextView>(R.id.tv_detailAct)
        tvDetailAct.text = "$text"

    }
}