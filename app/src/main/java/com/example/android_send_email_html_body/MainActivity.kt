package com.example.android_send_email_html_body

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_share.setOnClickListener {
            val shareIntent = Intent(android.content.Intent.ACTION_SEND)
            shareIntent.type = "text/html"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Android Notification")
            shareIntent.putExtra(Intent.EXTRA_TEXT, HtmlCompat.fromHtml("<h1>Title</h1><p>This is a body</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
            startActivity(Intent.createChooser(shareIntent, "Share with:"))
        }
    }
}
