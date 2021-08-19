package com.example.crossfit;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AboutUs extends AppCompatActivity {

    LinearLayout layout,lay;
    MyDatabase db;
    //ArrayList<Person> persons;
    TextView textViewcrss2;
    String ttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        db = new MyDatabase(this);
        //persons = new ArrayList<>();
        layout=(LinearLayout)findViewById(R.id.LayoutCrossFit);
        lay=(LinearLayout)findViewById(R.id.lay);
        textViewcrss2 = (TextView)findViewById(R.id.textViewcrss2);
       // persons = db.loadd();

           /* TextView tv = new TextView(this);
             tv.setText(persons.get(0).crossfit);
             tv.setTextSize(15);
             tv.setTextColor(Color.BLACK);
            tv.setGravity(Gravity.CENTER);
            layout.addView(tv);

            TextView tv1 = new TextView(this);
            tv1.setText(persons.get(0).crossfitpurpose);
            tv1.setTextSize(15);
            tv1.setTextColor(Color.BLACK);
            tv1.setGravity(Gravity.CENTER);
            lay.addView(tv1); */



         ArrayList<String> studentNames = db.getAboutUs();
            ArrayList<String> Names = db.getAboutUsPurpose();
            for(String content : studentNames) {
              TextView tv = new TextView(this);
            tv.setText(content);
            tv.setTextSize(15);
           tv.setGravity(Gravity.CENTER);
           layout.addView(tv);
           }
       for(String contents : Names) {
            TextView tv1 = new TextView(this);
            tv1.setText(contents);
           tv1.setTextSize(15);
           tv1.setGravity(Gravity.CENTER);
            lay.addView(tv1);
        }

    }






}
