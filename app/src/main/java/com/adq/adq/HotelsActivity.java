package com.adq.adq;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.adq.adq.R.id.tv_list_fgm_hotels;


public class HotelsActivity extends ActionBarActivity implements View.OnClickListener {
//    public class HotelsActivity extends Activity implements ActionBar.TabListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        Typeface iconsFamily = Typeface.createFromAsset(getAssets(), "fonts/icomoon.ttf");


        TextView iconUser = (TextView) findViewById(tv_list_fgm_hotels);
        iconUser.setTypeface(iconsFamily);
        iconUser.setText("\ue604");

        TextView iconHeart = (TextView) findViewById(R.id.tv_maps_fgm_hotels);
        iconHeart.setTypeface(iconsFamily);
        iconHeart.setText("\ue601");

        TextView iconComment = (TextView) findViewById(R.id.tv_photos_fgm_hotels);
        iconComment.setTypeface(iconsFamily);
        iconComment.setText("\ue610");


    }


/*
    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch(v.getId()) {
            case R.id.tv_list_fgm_hotels: // R.id.textView1
                intent = new Intent(this, HotelsActivity.class);
                break;
            case R.id.tv_maps_fgm_hotels: // R.id.textView2
                intent = new Intent(this, AmigosActivity.class);
                break;
            case R.id.tv_photos_fgm_hotels: // R.id.textView3
                intent = new Intent();
        }
        startActivity(intent);
    }
*/
/*
    View view = findViewById(R.id.relativeLayout_ppal_activity_amigos);

    TextView tvList = (TextView) view.findViewById(R.id.tv_list_fgm_hotels);
    TextView tvMaps = (TextView) view.findViewById(R.id.tv_maps_fgm_hotels);
    TextView tvPhotos = (TextView) view.findViewById(R.id.tv_photos_fgm_hotels);
*/

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        TextView tvList = (TextView) v.findViewById(R.id.tv_list_fgm_hotels);
        TextView tvMaps = (TextView) v.findViewById(R.id.tv_list_fgm_hotels);
        TextView tvPhotos = (TextView) v.findViewById(R.id.tv_list_fgm_hotels);

/*        tvList.setTextColor(getResources().getColorStateList(R.color.custom_greyDrk_5e5e5e));
        tvMaps.setTextColor(getResources().getColorStateList(R.color.custom_greyDrk_5e5e5e));
        tvPhotos.setTextColor(getResources().getColorStateList(R.color.custom_greyDrk_5e5e5e));*/

        switch(v.getId()) {
            case R.id.tv_list_fgm_hotels: // R.id.textView1

                Toast.makeText(this, "VIEW ALL", Toast.LENGTH_SHORT).show();

                tvList = (TextView) v.findViewById(R.id.tv_list_fgm_hotels);

                tvList.setTextColor(getResources().getColorStateList(R.color.color_secundary_adq));

                intent = new Intent(this, HotelsActivity.class);
                break;
            case R.id.tv_maps_fgm_hotels: // R.id.textView2

                Toast.makeText(this, "VIEW ALL", Toast.LENGTH_SHORT).show();

                tvMaps = (TextView) v.findViewById(R.id.tv_list_fgm_hotels);



                try {
                    tvMaps.setTextColor(0xFFFFFFFF);
                } catch (Exception e) {}



//                tvMaps.setTextColor(getResources().getColorStateList(R.color.color_secundary_adq));
                intent = new Intent(this, AmigosActivity.class);
                break;
            case R.id.tv_photos_fgm_hotels: // R.id.textView3
                intent = new Intent();
        }
        startActivity(intent);
    }
}
