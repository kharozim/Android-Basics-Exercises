package id.refactory.andoridbasicapps

import android.content.Context
import android.content.Intent

// make intent extension class
fun <T> Context.intentTo(destination: Class<T>){
    startActivity(Intent(this, destination))
    
}