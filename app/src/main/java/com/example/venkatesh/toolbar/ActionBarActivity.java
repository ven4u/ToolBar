package com.example.venkatesh.toolbar;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActionBarActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actiobar);

        android.support.v7.widget.Toolbar mToolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.standalone);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ActionBar Toolbar");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String title = (String) item.getTitle();
        Snackbar.make(getWindow().getDecorView().getRootView(), title, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }


}
