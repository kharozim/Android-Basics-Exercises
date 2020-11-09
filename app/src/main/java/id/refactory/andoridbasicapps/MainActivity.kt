package id.refactory.andoridbasicapps

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btOne = findViewById<Button>(R.id.bt_one)
        val btTwo = findViewById<Button>(R.id.bt_two)
        val btThree = findViewById<Button>(R.id.bt_three)

        btOne.setOnClickListener { intentTo(FirstActivity::class.java) }
        btTwo.setOnClickListener { intentTo(SecondActivity::class.java) }
        btThree.setOnClickListener { intentTo(ThirdActivity::class.java) }
    }

}