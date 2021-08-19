package com.example.crossfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Biceps extends AppCompatActivity {
    MyDatabase db;
    ArrayList<BicepsData> biceps;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        db = new MyDatabase(this);
        layout = (LinearLayout) findViewById(R.id.layout);
        biceps = db.getbicepsResults();
        for (BicepsData e : biceps) {
            String name = e.Name;
            String des = e.Description;
            String img = e.Image;
            ImageView imgv = new ImageView(this);
            imgv.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Intent intent=new Intent(Biceps.this,StopWatch.class);
                    startActivity(intent);
                    return false;
                }
            });
            int resId = getResources().getIdentifier(img, "raw", getPackageName());
            Glide.with(this).load(resId).into(imgv);
            layout.addView(imgv);
            TextView tv1 = new TextView(this);
            tv1.setText(name);
            tv1.setGravity(Gravity.CENTER);
            tv1.setTextSize(25);
            tv1.setTextColor(Color.rgb(247, 137, 0));
            layout.addView(tv1);
            TextView tv2 = new TextView(this);
            tv2.setText(des);
            tv2.setTextSize(15);
            tv2.setTextColor(Color.BLACK);
            tv2.setGravity(Gravity.CENTER);
            tv2.setAllCaps(true);
            layout.addView(tv2);
        }
    }
}
