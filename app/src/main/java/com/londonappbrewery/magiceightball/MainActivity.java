package com.londonappbrewery.magiceightball;

import android.content.res.Resources;
import android.net.nsd.NsdManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay=(ImageView) findViewById(R.id.image_eightBall);

        Button aButton=(Button)findViewById(R.id.askButton);

        final int[] ballArray={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randno=new Random();
                int rno=randno.nextInt(5);
                ballDisplay.setImageResource(ballArray[rno]);
            }
        });
    }
}
