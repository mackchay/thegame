package com.example.thegame

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.view.Window

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main2)








        }
    fun wind2(v:View) {
        var next2: Intent = Intent(this,Main3Activity::class.java)
        startActivity(next2)



    }

        }







    }


}
class ourView(context: Context, attributeSet: AttributeSet): View(context,attributeSet) {

    var obj: Paint = Paint()

    override fun onDraw(canvas: Canvas){
        super.onDraw(canvas)
        obj.color = Color.YELLOW
        canvas.drawOval(RectF(20f,20f,20f,20f), obj )


    }







}