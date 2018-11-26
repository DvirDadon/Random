package com.example.simulation.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    TextView text1;
    int x;
    int y;
    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        text1=(TextView)findViewById(R.id.text1);
    }


    public void btnclick(View view) {
        x=rand.nextInt(100);
        text1.setText("The number is:"+x);
    }

    public void btnclick1(View view) {
       text1.setText("Number not found");
    }
}


