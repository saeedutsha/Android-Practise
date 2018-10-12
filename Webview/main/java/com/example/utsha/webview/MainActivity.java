package com.example.utsha.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ourmethod(View view){

        if(view.getId()==R.id.button) {
            Intent i = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button2) {
            Intent i = new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.button3) {
            Intent i = new Intent(MainActivity.this,FourthActivity.class);
            startActivity(i);
        }

    }


}
