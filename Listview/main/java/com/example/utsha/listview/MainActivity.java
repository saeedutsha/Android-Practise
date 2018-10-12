package com.example.utsha.listview;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] s1 = {"Addition","Subtraction","Multiplication","Division"};
    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (ListView)findViewById(R.id.listview);
        ListAdapter listAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,s1);
        l1.setAdapter(listAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,String.valueOf(parent.getItemAtPosition(position)),Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Hello Brother !! ");
                alertDialog.setMessage("You have choosed "+String.valueOf(parent.getItemAtPosition(position)));
                alertDialog.create();
                alertDialog.show();

            }
        });

    }
}
