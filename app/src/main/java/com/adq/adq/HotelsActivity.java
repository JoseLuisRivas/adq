package com.adq.adq;


import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class HotelsActivity extends ActionBarActivity {
//    public class HotelsActivity extends Activity implements ActionBar.TabListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        Typeface iconsFamily = Typeface.createFromAsset(getAssets(), "fonts/glyphIcons.ttf");


        TextView iconUser = (TextView) findViewById(R.id.tv_user);
        iconUser.setTypeface(iconsFamily);
        iconUser.setText("\ue604");

        TextView iconHeart = (TextView) findViewById(R.id.tv_icon_heart);
        iconHeart.setTypeface(iconsFamily);
        iconHeart.setText("\ue601");

        TextView iconComment = (TextView) findViewById(R.id.tv_comment_bubble);
        iconComment.setTypeface(iconsFamily);
        iconComment.setText("\ue610");



    }
}
