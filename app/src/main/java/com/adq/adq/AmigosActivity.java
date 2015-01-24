package com.adq.adq;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class AmigosActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos);


        Typeface iconsFamily = Typeface.createFromAsset(getAssets(), "fonts/glyphIcons.ttf");


        TextView iconUser = (TextView) findViewById(R.id.tv_Columna2);
        iconUser.setTypeface(iconsFamily);
        iconUser.setText("\ue604");

        TextView iconHeart = (TextView) findViewById(R.id.tv_Columna3);
        iconHeart.setTypeface(iconsFamily);
        iconHeart.setText("\ue601");

        TextView iconComment = (TextView) findViewById(R.id.tv_Columna4);
        iconComment.setTypeface(iconsFamily);
        iconComment.setText("\ue610");

        TextView iconUser1 = (TextView) findViewById(R.id.tv_Columna6);
        iconUser1.setTypeface(iconsFamily);
        iconUser1.setText("\ue604");

        TextView iconHeart2 = (TextView) findViewById(R.id.tv_Columna7);
        iconHeart2.setTypeface(iconsFamily);
        iconHeart2.setText("\ue609");

        TextView iconComment3 = (TextView) findViewById(R.id.tv_Columna8);
        iconComment3.setTypeface(iconsFamily);
        iconComment3.setText("\ue610");
    }


}
