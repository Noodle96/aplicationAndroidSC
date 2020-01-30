package com.example.myaplicationnametest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "There is a new Actualization x2", Toast.LENGTH_LONG).show();
        int test = Test();
    }

    public int Test(){
        int a = 10;
        int b = 15;
        int c = 20;
        if(a < b){
            return a;
        }
        return b;
    }
}
