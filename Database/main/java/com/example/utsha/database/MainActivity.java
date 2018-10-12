package com.example.utsha.database;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText E1, E2, E3, E4;
    Button B1;
    TextView T1;
    MySqlite mySqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E1 = (EditText) findViewById(R.id.editText);
        E2 = (EditText) findViewById(R.id.editText2);
        E3 = (EditText) findViewById(R.id.editText3);
        E4 = (EditText) findViewById(R.id.editText4);
        B1 = (Button) findViewById(R.id.button);
        T1 = (TextView) findViewById(R.id.textView);
        mySqlite = new MySqlite(this);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //boolean mychecker =
                mySqlite.addToTable(E1.getText().toString(), E2.getText().toString(), E3.getText().toString(), E4.getText().toString());
                /*if(mychecker==true){
                    Toast.makeText(MainActivity.this,"Succesfully Inserted",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Not Inserted",Toast.LENGTH_LONG).show();
                }*/
            }
        });

    }

    public void displaydata(View view) {
        Cursor result = mySqlite.display();
        if (result.getCount() == 0) {
            Toast.makeText(this, "NO DATA FOUND", Toast.LENGTH_LONG).show();
            return;
        }
        result.moveToFirst();
        StringBuffer stringBuffer = new StringBuffer();

        do {
            stringBuffer.append("ID: " + result.getString(0) + "\n");
            stringBuffer.append("Email: " + result.getString(1) + "\n");
            stringBuffer.append("First Name: " + result.getString(2) + "\n");
            stringBuffer.append("Last Name: " + result.getString(3) + "\n\n");
        } while (result.moveToNext());

        viewdata(stringBuffer.toString());
    }

    public void viewdata(String data) {
        T1.setText(data);
    }

    public void updatedata(View view) {
        boolean checker = mySqlite.updateOfData(E1.getText().toString(), E2.getText().toString(), E3.getText().toString(), E4.getText().toString());
        if (checker == true)
            Toast.makeText(this, "Updated Successfully", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Not Updated", Toast.LENGTH_LONG).show();
    }

    public void deletedata(View view){
        int deletechecker = mySqlite.deleteAnyData(E1.getText().toString());
        if(deletechecker>0)
            Toast.makeText(this, "Deleted Successfully", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Not Deleted", Toast.LENGTH_LONG).show();
    }

    public void cleardata(View view){
        mySqlite.deleteAllData();
    }

}

