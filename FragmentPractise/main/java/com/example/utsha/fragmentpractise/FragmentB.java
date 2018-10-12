package com.example.utsha.fragmentpractise;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.utsha.fragmentpractise.R;


public class FragmentB extends android.app.Fragment {

    EditText e1,e2;
    Button b;
    TextView t;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_b, container, false);

        e1 = (EditText)view.findViewById(R.id.editText3);
        e2 = (EditText)view.findViewById(R.id.editText2);
        b = (Button)view.findViewById(R.id.button3);
        t = (TextView)view.findViewById(R.id.textView3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ourmethod();
            }
        });
        return view;
    }

    public void ourmethod(){
        String s1,s2,s3;
        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        s3 = s1 + s2;
        t.setText(s3);
        Toast.makeText(this.getActivity(),s3,Toast.LENGTH_LONG).show();
    }

}
