package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clter= findViewById(R.id.button);
        TextView hamad=findViewById(R.id.textView3);
        TextView hamad1=findViewById(R.id.textView4);
        EditText hamad2=findViewById(R.id.editTextTextPersonName3);
        EditText hamad3=findViewById(R.id.editTextTextPersonName4);


        clter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(hamad3.getText().toString());
                int n2=Integer.parseInt(hamad2.getText().toString());
                int result = n1+n2;
                hamad1.setText(String.valueOf(result));
            }
        });



    }


}