package com.example.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


buttonCalculate.setOnClickListener() {
    val height: Double = (editTextHeight.text.toString().toDouble()/100)
    val bmi: Double = editTextWeight.text.toString().toDouble() / (height*2 )

    textViewBMI.text = "BMI = %.2f".format(bmi)

if(bmi<18.5)
{
    imageViewProfile.setImageResource(R.drawable.under);
}
    else if(bmi>18.5 && bmi<=24.9)
{
    imageViewProfile.setImageResource(R.drawable.normal);
}
    else
{
    imageViewProfile.setImageResource(R.drawable.over);
}

}
        buttonReset.setOnClickListener()
        {
            editTextHeight.text=null;
            editTextWeight.text = null;
            textViewBMI.text =null;
            imageViewProfile.setImageResource(R.drawable.empty)

        }
    }
}
