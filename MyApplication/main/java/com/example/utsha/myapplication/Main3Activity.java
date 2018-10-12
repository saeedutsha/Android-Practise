package com.example.utsha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    TextView t1,t2,t3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = (TextView) findViewById(R.id.textView12);
        t2 = (TextView) findViewById(R.id.textView14);
        t3 = (TextView) findViewById(R.id.textView16);
        MainActivity p;
        p = new MainActivity();
        t1.setText(Integer.toString(p.income));
        t2.setText(Integer.toString(p.expense));
        int c=p.balance;
        t3.setText(Integer.toString(c));
    }
}
