package com.example.minicalculatorsarocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            var i = 0
            var g1 = n1.text.toString()
            val gg1 = g1.toInt()
            var g2 = n2.text.toString()
            val gg2 = g2.toInt()
            if(g2 == "" || g1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input num 1 and num 2 !!!", Toast.LENGTH_SHORT
                ).show()
            } else if (gg2 == 0 ){
                Toast.makeText(
                    applicationContext,
                    "Do not Num2 is Zero or Null!!!", Toast.LENGTH_SHORT
                ).show()
                n2.setText("")
            } else {
                val gg2 = gg2.toInt()
                i = gg1 + gg2
                var re = i.toDouble()
                res.setText(re.toString())
                oparator.setText("+")
            }
        }

        minus.setOnClickListener {
            var i = 0
            var g1 = n1.text.toString()
            val gg1 = g1.toInt()
            var g2 = n2.text.toString()
            val gg2 = g2.toInt()
            if(g2 == "" || g1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input num 1 and num 2 !!!", Toast.LENGTH_SHORT
                ).show()
            } else if (gg2 == 0 ){
                Toast.makeText(
                    applicationContext,
                    "Do not Num2 is Zero or Null!!!", Toast.LENGTH_SHORT
                ).show()
                n2.setText("")
            } else {
                val gg2 = gg2.toInt()
                i = gg1 - gg2
                var re = i.toDouble()
                res.setText(re.toString())
                oparator.setText("-")
            }
        }

        multiply.setOnClickListener {
            var i = 0
            var g1 = n1.text.toString()
            val gg1 = g1.toInt()
            var g2 = n2.text.toString()
            val gg2 = g2.toInt()
            if(g2 == "" || g1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input num 1 and num 2 !!!", Toast.LENGTH_SHORT
                ).show()
            } else if (gg2 == 0 ){
                Toast.makeText(
                    applicationContext,
                    "Do not Num2 is Zero or Null!!!", Toast.LENGTH_SHORT
                ).show()
                n2.setText("")
            } else {
                val gg2 = gg2.toInt()
                i = gg1 * gg2
                var re = i.toDouble()
                res.setText(re.toString())
                oparator.setText("*")
            }
        }

        divider.setOnClickListener {
            var i = 0
            var g1 = n1.text.toString()
            val gg1 = g1.toInt()
            var g2 = n2.text.toString()
            val gg2 = g2.toInt()
            if(g2 == "" || g1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input num 1 and num 2 !!!", Toast.LENGTH_SHORT
                ).show()
            } else if (gg2 == 0 ){
                Toast.makeText(
                    applicationContext,
                    "Do not Num2 is Zero or Null!!!", Toast.LENGTH_SHORT
                ).show()
                n2.setText("")
            } else {
                val gg2 = gg2.toInt()
                i = gg1 / gg2
                var re = i.toDouble()
                res.setText(re.toString())
                oparator.setText("/")
            }
        }

        modulo.setOnClickListener {
            var i = 0
            var g1 = n1.text.toString()
            val gg1 = g1.toInt()
            var g2 = n2.text.toString()
            val gg2 = g2.toInt()
            if(g2 == "" || g1 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please input num 1 and num 2 !!!", Toast.LENGTH_SHORT
                ).show()
            } else if (gg2 == 0 ){
                Toast.makeText(
                    applicationContext,
                    "Do not Num2 is Zero or Null!!!", Toast.LENGTH_SHORT
                ).show()
                n2.setText("")
            } else {
                val gg2 = gg2.toInt()
                i = gg1 % gg2
                var re = i.toDouble()
                res.setText(re.toString())
                oparator.setText("%")
            }
        }

        clear.setOnClickListener{
            n1.setText("")
            n2.setText("")
            res.setText("")
            oparator.setText("")
        }
    }
}