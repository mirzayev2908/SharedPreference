package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        TextView textView1,textView2;
        textView1=findViewById(R.id.other_textViewOne);
        textView2=findViewById(R.id.other_textViewTwo);

        SharedPreferences sp=getApplicationContext().getSharedPreferences("MyUserPrefs", Context.MODE_PRIVATE);
        String name= sp.getString("name", "");
        String email= sp.getString("email", "");

        textView1.setText(name);
        textView2.setText(email);
    }
}