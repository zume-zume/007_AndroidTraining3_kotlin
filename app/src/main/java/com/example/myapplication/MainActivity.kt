package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // リスト項目をリストとして準備
        val data = mutableListOf("胡椒", "ターメリック", "サフラン", "ニンニク", "生姜")

        // 配列アダプタを作成し、ListViewに登録
        val list = findViewById<ListView>(R.id.list)
        list.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
    }
}