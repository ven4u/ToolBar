package com.example.venkatesh.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button mButtonStandalone;
    Button mButtonActionBar;
    Button mButtonConstrain;
    final String TAG = this.getClass().getName();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonStandalone = findViewById(R.id.standalone_toolbar);
        mButtonActionBar = findViewById(R.id.actionbar_toolbar);
        mButtonConstrain = findViewById(R.id.constrain_toolbar);
        mButtonStandalone.setOnClickListener(this);
        mButtonActionBar.setOnClickListener(this);
        mButtonConstrain.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.standalone_toolbar:
                Log.d(TAG, "STANDALONE BUTTON IS CLICKED");
                //TODO
                intent = new Intent(MainActivity.this, StandaloneActivity.class );
                startActivity(intent);
                break;
            case R.id.actionbar_toolbar:
                Log.d(TAG, "ACTIONBAR BUTTON IS CLICKED");
                //TODO
                intent = new Intent(MainActivity.this, ActionBarActivity.class );
                startActivity(intent);
                break;
            case R.id.constrain_toolbar:
                Log.d(TAG, "CONSTRAIN BUTTON IS CLICKED");
                //TODO
                intent = new Intent(MainActivity.this, ConstrainActivity.class );
                startActivity(intent);
                break;
        }
    }
}
