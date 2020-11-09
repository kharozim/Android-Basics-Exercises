package id.refactory.andoridbasicapps

import android.content.Context
import android.content.Intent

/*
 make intent extension function
 https://stackoverflow.com/questions/53803667/kotlin-extension-function-start-activity-with-intent-extras
*/
fun <T> Context.intentTo(destination: Class<T>){
    startActivity(Intent(this, destination))

}

