package com.nepplus.kotlinbasic_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName = "김다은"   //자료형? string 세팅
        myName = "김은다"
        Log.d("이름출력-변수활용", myName)

        // 한 사용자의 나이를 17살 이라고 저장.
        val userAge = 8

//       이 사람이 성인인가? 나이가 20살 이상인가?
        if (userAge >= 20) {
            // if ( )내무의 질문 결과가 true 일때 만 실행됨.
            Log.d("if문예시", "성인이 맞습니다.")
        }
        else if (userAge >= 17) {
            //20살 미만 + 17살 이상인 경우.
            Log.d("if문예시", "고등학생 입니다.")

        }
        else if (userAge >= 14) {
            Log.d("if문예시", "중학생입니다.")
        }

        else {
            Log.d("if문예시","초등학생 or 미취학아동입니다.")
        }


        introduceToastBtn.setOnClickListener {


            Toast.makeText(this, "저는 김다은 입니다", Toast.LENGTH_SHORT).show()


        }


        toastBtn.setOnClickListener {


            Toast.makeText(this, "반갑습니다.", Toast.LENGTH_SHORT).show()
                    }




        LogBtn.setOnClickListener  {


            Log.d("메인화면", "로그 버튼 눌림")


        }

        secondLogBtn.setOnClickListener {


            Log.e("메인화면","두번째 로그 버튼 눌림")


        }



    }
}