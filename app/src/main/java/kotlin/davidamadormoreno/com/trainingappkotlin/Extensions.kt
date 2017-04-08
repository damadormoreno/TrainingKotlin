package kotlin.davidamadormoreno.com.trainingappkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by David on 09/04/2017.
 */

fun Context.toast(text : CharSequence, length : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,text,length).show()
}

fun ViewGroup.inflate(layoutRes : Int): View {
    return LayoutInflater.from(context).inflate(layoutRes,this,false)
}

fun ImageView.loadUrl(url:String){
    Picasso.with(context).load(url).into(this)
}
