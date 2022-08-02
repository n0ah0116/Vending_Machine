package com.thlee.vendingmachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var cocacola: Button // 코카콜라
    lateinit var pepsi: Button // 팹시
    lateinit var sprite: Button // 스프라이트
    lateinit var fanta: Button // 환타
    lateinit var mtndew: Button // 마운틴 듀
    lateinit var balance: TextView // 입금 잔액
    lateinit var change: Button // 거스름돈

    lateinit var V100won: Button
    lateinit var V500won: Button
    lateinit var V1000won: Button
    lateinit var V5000won: Button
    lateinit var V10000won: Button


    var total: Int = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cocacola = findViewById(R.id.cocacola)
        pepsi = findViewById(R.id.pepsi)
        sprite = findViewById(R.id.sprite)
        fanta = findViewById(R.id.fanta)
        mtndew = findViewById(R.id.mtndew)
        balance = findViewById(R.id.balance)
        change = findViewById(R.id.change)
        V100won = findViewById(R.id.V100won)
        V500won = findViewById(R.id.V500won)
        V1000won = findViewById(R.id.V1000won)
        V5000won = findViewById(R.id.V5000won)
        V10000won = findViewById(R.id.V10000won)


        //금액 추가 버튼 클릭 시
        V100won.setOnClickListener {

            total = total + 100
            balance.text = "$total"

        }
        V500won.setOnClickListener {

            total = total + 500
            balance.text = "$total"

        }
        V1000won.setOnClickListener {

            total = total + 1000
            balance.text = "$total"

        }
        V5000won.setOnClickListener {

            total = total + 5000
            balance.text = "$total"

        }
        V10000won.setOnClickListener {

            total = total + 10000
            balance.text = "$total"

        }


        // 뽑기 버튼을 누를시 금액 차감, 금액이 부족시 Toast메세지로 "잔액이 부족합니다." 표시

        cocacola.setOnClickListener {
            if (total >= 1200) {
                total = total - 1200
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "콜라를 뽑았습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "콜라를 뽑기에는 잔액이 부족합니다.", Toast.LENGTH_SHORT).show()
            }

        }
        pepsi.setOnClickListener {
            if (total >= 800) {
                total = total - 800
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "팹시를 뽑았습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "팹시를 뽑기에는 잔액이 부족합니다.", Toast.LENGTH_SHORT).show()
            }

        }
        sprite.setOnClickListener {
            if (total >= 1100) {
                total = total - 1100
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "스프라이트를 뽑았습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "스프라이트를 뽑기에는 잔액이 부족합니다.", Toast.LENGTH_SHORT)
                    .show()
            }

        }
        fanta.setOnClickListener {
            if (total >= 1400) {
                total = total - 1400
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "환타를 뽑았습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "환타를 뽑기에는 잔액이 부족합니다.", Toast.LENGTH_SHORT).show()
            }

        }
        mtndew.setOnClickListener {
            if (total >= 1600) {
                total = total - 1600
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "마운틴듀를 뽑았습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "마운틴듀를 뽑기에는 잔액이 부족합니다.", Toast.LENGTH_SHORT)
                    .show()
            }

        }

        change.setOnClickListener {

            if (total > 0) {
                total = 0
                balance.text = "$total"
                Toast.makeText(this@MainActivity, "잔돈 반환완료", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "반환 금액이 없습니다.", Toast.LENGTH_SHORT).show()
            }

        }

    }
}