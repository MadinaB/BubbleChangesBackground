package com.madinabektayeva.buttonsarsenal2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  Button bubbleButton;
    private ConstraintLayout myConstraintLayout;
    private ImageView myImageView;
    private int backgroundImageCurrent = 0;
    int[] backgroundImages={R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,
                           R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,
           R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bubbleButton = (Button)findViewById(R.id.button1);
        myConstraintLayout = (ConstraintLayout)findViewById(R.id.constraintlayout1);
        myImageView = (ImageView)findViewById(R.id.imageView);

        bubbleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myImageView.setImageResource(backgroundImages[backgroundImageCurrent]);
                
                backgroundImageCurrent++;
                if(backgroundImageCurrent>=13){
                    backgroundImageCurrent-=13;
                }
            }
        });

    }

}
