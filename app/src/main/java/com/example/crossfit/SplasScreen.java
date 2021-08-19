package com.example.crossfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplasScreen extends AppCompatActivity {
    ImageView imageView;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);
        handler=new Handler();
        CountDown c= new CountDown(5);
        c.start();

    }
    public class CountDown extends Thread{
        int start;
        public CountDown(int starting){
            this.start=starting;
        }

        @Override
        public void run() {

            for(int counter=start;counter>=0;counter--)
            {
            final int finalcounter=counter;
                handler.post(new Runnable() {
                    @Override
                    public void run() {

                    }
                });

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Intent intent=new Intent(SplasScreen.this,MainActivity.class);
            startActivity(intent);

        }

    }

}
