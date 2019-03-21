package com.example.hzy.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void skip1(View view){
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,linear1.class);
            startActivity(intent);
             }

        public void skip2(View view){
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,Constraint1.class);
        startActivity(intent);
        }

        public void skip3(View view){
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,table1.class);
        startActivity(intent);
        }
}
