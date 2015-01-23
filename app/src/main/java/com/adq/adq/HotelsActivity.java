package com.adq.adq;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;



public class HotelsActivity extends ActionBarActivity implements ActionBar.TabListener {
//    public class HotelsActivity extends Activity implements ActionBar.TabListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        setTabas();


    }

    private void setTabas(){
// Manipulo el Action bar del Activity por código
        // primero cargo el actionbar
        //android.app.ActionBar actionBar = getActionBar();
        // Creo una vista de tablas con el metodo NAVIGATION_MODE_TABS
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
/*
        actionBar.addTab(actionBar.newTab().setText("Hoteles").setTabListener((android.app.ActionBar.TabListener) this));
        actionBar.addTab(actionBar.newTab().setText("Amigos").setTabListener((android.app.ActionBar.TabListener) this));
        actionBar.addTab(actionBar.newTab().setText("Perfíl").setTabListener((android.app.ActionBar.TabListener) this));
        */
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
