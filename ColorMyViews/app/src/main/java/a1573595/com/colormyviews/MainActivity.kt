package a1573595.com.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListen()
    }

    private fun setListen(){
        val clickableView: List<View> = listOf(tv_box_one, tv_box_two, tv_box_three, tv_box_four, tv_box_five,
            btn_red, btn_yellow, btn_green)

        for(item in clickableView)
            item.setOnClickListener { makeColored(it) }
    }

    private fun makeColored(v: View){
        when(v.id){
            R.id.tv_box_one -> v.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box_two -> v.setBackgroundColor(Color.GRAY)
            R.id.tv_box_three -> v.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_box_four -> v.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_box_five -> v.setBackgroundResource(android.R.color.holo_green_light)
            R.id.btn_red -> tv_box_three.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.btn_yellow -> tv_box_four.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.btn_green -> tv_box_five.setBackgroundResource(android.R.color.holo_green_dark)
            else -> v.setBackgroundColor(Color.LTGRAY)
        }
    }
}
