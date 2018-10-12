package com.example.utsha.myapplication;


import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class Main2Activity extends AppCompatActivity {


    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e=(EditText) findViewById(R.id.editText4);
    }

    public void ADD(View V) {

        int num1;
        num1 = Integer.parseInt(e.getText().toString());
        MainActivity p = new MainActivity();
        p.income += num1;
        p.balance+=num1;
        String K;
        K = new String();
        K=Integer.toString(p.balance);
        Toast.makeText(getApplicationContext(),K, Toast.LENGTH_LONG).show();
    }
    public void SUB(View V) {

        int num1;
        num1 = Integer.parseInt(e.getText().toString());
        MainActivity p = new MainActivity();
        p.expense+= num1;
        p.balance-=num1;
        String K;
        K = new String();
        K=Integer.toString(p.balance);
        Toast.makeText(getApplicationContext(),K, Toast.LENGTH_LONG).show();

    }

}
