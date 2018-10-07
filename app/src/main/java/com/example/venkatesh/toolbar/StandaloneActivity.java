package com.example.venkatesh.toolbar;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {

    View view;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        android.support.v7.widget.Toolbar mToolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.standalone);
        mToolbar.setTitle("Standalone Toolbar");
        mToolbar.setSubtitle("By Venkatesh");
        mToolbar.setNavigationIcon(R.drawable.baseline_navigate_before_black_18dp);
        mToolbar.setElevation(10f);

        mToolbar.inflateMenu(R.menu.menu_main);

        mToolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title = (String) menuItem.getTitle();
                Snackbar.make(getWindow().getDecorView().getRootView(), title, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                return true;
            }
        });

    }

    @Override
    public void onClick(View view) {

    }


}
