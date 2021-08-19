package com.example.crossfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new MyDatabase(this);

    }
    public void about_btn(View v){
        Intent intent=new Intent(MainActivity.this,AboutUs.class);
        startActivity(intent);
    }
    public void chest_btn(View v){
        Intent intent=new Intent(MainActivity.this,Chest.class);
        startActivity(intent);
    }
    public void abs_btn(View v){
        Intent intent=new Intent(MainActivity.this,Abs.class);
        startActivity(intent);
    }
    public void biceps_btn(View v){
        Intent intent=new Intent(MainActivity.this,Biceps.class);
        startActivity(intent);
    }
    public void cardio_btn(View v){
        Intent intent=new Intent(MainActivity.this,Cardio.class);
        startActivity(intent);
    }
    public void shoulder_btn(View v){
        Intent intent=new Intent(MainActivity.this,Shoulder.class);
        startActivity(intent);
    }
    public void maps_btn(View v){
        Intent intent=new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }

}
