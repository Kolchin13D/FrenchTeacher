package com.example.frenchteacher

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun SayColor(view: View) {
        val clickedButton: Button = view as Button

        var mediaPlayer: MediaPlayer = MediaPlayer.create(
            this,
            resources.getIdentifier(
                clickedButton.tag.toString(),
                "raw",
                packageName
            )
        )

        mediaPlayer.start()
    }
}