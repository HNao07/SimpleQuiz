package com.example.simplequiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity : AppCompatActivity() {
    //
    private val quizData = arrayOf("A0","A1","A2","A3")
    private var i = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount:TextView = findViewById(R.id.tvCount)
        val tvQuestion:TextView = findViewById(R.id.tvCount)
        val btn0:Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        //var i =0

        //配列を用意,commm
        //val quizData = arrayOf("A0","A1","A2","A3")

        //0~3までのリスト用意→シャッフル
        var list = listOf(Random().nextInt(4),Random().nextInt(4),Random().nextInt(4),Random().nextInt(4))
        val num = list.sorted()

        //ボタンにquizData
        btn0.text = quizData[num[0]]
        btn1.text = quizData[num[1]]
        btn2.text = quizData[num[2]]
        btn3.text = quizData[num[3]]


        //btn0を押したときの正誤判定
        btn0.setOnClickListener {
            if (btn0.text==quizData[num[i]] || btn0.text=="A"+ quizData[num[i]]){
                //正解
                correctAns()

                //カウントを1増やして。無効化
                i++
                btn0.isEnabled = false
                tvCount.text =i.toString() + "問正解"

                if (i==4){
                    tvQuestion.text="全問正解"
                }

            }else{
                //不正解、ボタンの無効化
                incorrectAns()
            }
        }
        btn1.setOnClickListener {
            if (btn1.text==quizData[num[i]] || btn1.text=="A"+ quizData[num[i]]){
                //正解
                correctAns()

                //カウントを1増やして。無効化
                i++
                btn1.isEnabled = false
                tvCount.text =i.toString() + "問正解"

                if (i==4){
                    tvQuestion.text="全問正解"
                }

            }else{
                //不正解、ボタンの無効化
                incorrectAns()
            }
        }
        btn2.setOnClickListener {
            if (btn2.text==quizData[num[i]] || btn2.text=="A"+ quizData[num[i]]){
                //正解
                correctAns()

                //カウントを1増やして。無効化
                i++
                btn2.isEnabled = false
                tvCount.text =i.toString() + "問正解"

                if (i==4){
                    tvQuestion.text="全問正解"
                }

            }else{
                //不正解、ボタンの無効化
                incorrectAns()
            }
        }
        btn3.setOnClickListener {
            if (btn3.text==quizData[num[i]] || btn3.text=="A"+ quizData[num[i]]){
                //正解
                correctAns()

                //カウントを1増やして。無効化
                i++
                btn3.isEnabled = false
                tvCount.text =i.toString() + "問正解"

                if (i==4){
                    tvQuestion.text="全問正解"
                }

            }else{
                //不正解、ボタンの無効化
                incorrectAns()
            }
        }

    }
    //正解の関数(アラートダイアログ）
    private fun correctAns() {
        AlertDialog.Builder(this)
            .setTitle("正解")
            .setMessage(quizData[i])
            .setPositiveButton("OK", null)
            .show()
    }

    //不正解処理の関数
    private fun incorrectAns(){
        //viewの取得
        val tvQuestion:TextView = findViewById(R.id.tvCount)
        val btn0:Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)

        //不正解、ボタンの無効化
        tvQuestion.text="不正解、Game Over"
        btn0.isEnabled = false
        btn1.isEnabled = false
        btn2.isEnabled = false
        btn3.isEnabled = false
    }

    //sdadsa
}
