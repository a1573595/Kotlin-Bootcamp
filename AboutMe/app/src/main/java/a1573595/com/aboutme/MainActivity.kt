package a1573595.com.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import a1573595.com.aboutme.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //private val myName: MyName = MyName(getString(R.string.name))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = MyName(getString(R.string.name))

        binding.btnDone.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(v: View){
        binding.apply {
            //tvNickname.text = binding.edNickname.text
            myName?.nickName = edNickname.text.toString()
            invalidateAll()
            btnDone.visibility = View.GONE
            edNickname.visibility = View.GONE
            tvNickname.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)
    }
}
