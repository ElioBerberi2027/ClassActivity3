package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.mainText)
        val increaseButton = findViewById<Button>(R.id.incButton)
        val decreaseButton = findViewById<Button>(R.id.decButton)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        var textSize = 17f
        textView.textSize = textSize

        increaseButton.isEnabled = false
        decreaseButton.isEnabled = false

        checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
                increaseButton.isEnabled = isChecked
                decreaseButton.isEnabled = isChecked
            }
        })

        increaseButton.setOnClickListener {
            textSize += 4f
            textView.textSize = textSize
        }

        decreaseButton.setOnClickListener {
            textSize -= 2f
            textView.textSize = textSize
        }
    }
}
