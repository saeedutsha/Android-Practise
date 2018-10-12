package com.example.utsha.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    public static int balance,income,expense;


    Button Use_Wallet,usage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Use_Wallet = (Button) findViewById(R.id.button1);
        Use_Wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);


            }
        });
        usage = (Button) findViewById(R.id.button);
        usage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);


            }
        });
    }

}
