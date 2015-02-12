package com.hishatech.android.hishabeats;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button btnC0R0, btnC0R1, btnC0R2, btnC0R3, btnC1R0, btnC1R1, btnC1R2, btnC1R3,
            btnC2R0, btnC2R1, btnC2R2, btnC2R3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC0R0 = (Button) findViewById(R.id.btnC0R0);
        btnC0R1 = (Button) findViewById(R.id.btnC0R1);
        btnC0R2 = (Button) findViewById(R.id.btnC0R2);
        btnC0R3 = (Button) findViewById(R.id.btnC0R3);
        btnC1R0 = (Button) findViewById(R.id.btnC1R0);
        btnC1R1 = (Button) findViewById(R.id.btnC1R1);
        btnC1R2 = (Button) findViewById(R.id.btnC1R2);
        btnC1R3 = (Button) findViewById(R.id.btnC1R3);
        btnC2R0 = (Button) findViewById(R.id.btnC2R0);
        btnC2R1 = (Button) findViewById(R.id.btnC2R1);
        btnC2R2 = (Button) findViewById(R.id.btnC2R2);
        btnC2R3 = (Button) findViewById(R.id.btnC2R3);

        SharedPreferences prefs = getSharedPreferences(AppConstants
                .pref_name, 0);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.About:
                Intent Aboutintent = new Intent(this, AboutActivity.class);
                this.startActivity(Aboutintent);
                break;

        }
        return false; // should never happen
    }
}