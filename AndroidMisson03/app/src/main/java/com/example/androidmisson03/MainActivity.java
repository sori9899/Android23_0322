package com.example.androidmisson03;

import static java.sql.Types.NULL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    Button btnTop, btnBtm;

    ImageView imgTop, imgBtm;


    ScrollView ST, SB;

    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Show Image Shuffle");

        btnTop = (Button) findViewById(R.id.BtnTop);
        btnBtm = (Button) findViewById(R.id.BtnBtm);

        imgBtm = (ImageView) findViewById(R.id.ImgBottom);
        imgTop = (ImageView) findViewById(R.id.ImgTop);

        ST=(ScrollView) findViewById(R.id.scrollTop);
        SB = (ScrollView ) findViewById(R.id.scrollBtm);

        ST.setHorizontalFadingEdgeEnabled(true);
        ST.setVerticalFadingEdgeEnabled(true);

        SB.setHorizontalFadingEdgeEnabled(true);
        SB.setVerticalFadingEdgeEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.man);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeigth = bitmap.getIntrinsicHeight();

        imgTop.getLayoutParams().width = bitmapWidth;
        imgTop.getLayoutParams().height=bitmapHeigth;

        imgBtm.getLayoutParams().width = bitmapWidth;
        imgBtm.getLayoutParams().height=bitmapHeigth;


        btnBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtm.setImageResource(R.drawable.man );
                imgTop.setImageResource(NULL);
            }
        });

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgTop.setImageResource(R.drawable.man);
                imgBtm.setImageResource(NULL);
            }
        });
    }
}