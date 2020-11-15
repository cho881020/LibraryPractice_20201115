package kr.co.tjoeun.librarypractice_20201115

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        callBtn.setOnClickListener {

//            ACTION_CALL 을 이용해서 바로 전화 연결 => 권한획득처리도 같이 진행

            val myUri = Uri.parse("tel:010-8888-7777")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }

        viewPhotoBtn.setOnClickListener {
            val myIntent = Intent(mContext, ViewPhotoActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun setValues() {

        Glide.with(mContext).load("http://dimg.donga.com/wps/NEWS/IMAGE/2019/12/31/99024137.2.jpg").into(firstImg)

        Glide.with(mContext).load("https://i.ytimg.com/vi/pv8zYrpAN4E/maxresdefault.jpg").into(secondImg)

    }

}