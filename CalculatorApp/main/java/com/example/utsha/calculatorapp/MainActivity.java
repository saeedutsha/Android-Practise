package com.example.utsha.calculatorapp;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView5);

    }

    public void functionCalculator(View view) {
        int number1,number2,result = 0;

        number1 = Integer.parseInt(e1.getText().toString());
        number2 = Integer.parseInt(e2.getText().toString());

        if(view.getId()==R.id.button)
            result = number1 + number2;
        if(view.getId()==R.id.button2)
            result = number1 - number2;
        if(view.getId()==R.id.button3)
            result = number1 * number2;
        if(view.getId()==R.id.button4)
            result = number1 / number2;

        t1.setText(Integer.toString(result));

    }
}
