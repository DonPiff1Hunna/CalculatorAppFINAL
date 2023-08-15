package au.edu.swin.sdmd.calculatorapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valueX = findViewById<EditText>(R.id.x)
        val valueY = findViewById<EditText>(R.id.y)

        val calculate = findViewById<Button>(R.id.calculate)


        calculate.setOnClickListener  {

            val ans = add(valueX.text.toString(), valueY.text.toString())

            // TODO: show result on the screen

            var answer: TextView = findViewById(R.id.answerbox)
            answer.text = ans.toString()

            println("Answer is: $ans ")


        }


        fun onRadioButtonClicked(view: View) {
            if (view is RadioButton) {
                // Is the button now checked?
                val checked = view.isChecked

                // Check which radio button was clicked
                when (view.getId()) {
                    R.id.add ->
                        if (checked) {

                            // Pirates are the best

                        }
                    R.id.multiply ->
                        if (checked) {
                            // Ninjas rule
                        }
                }
            }
        }

    }

    private fun add(valueX: String, valueY: String) = valueX.toInt() + valueY.toInt()
}
