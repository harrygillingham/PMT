package com.example.gillingham.pmt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

            case R.id.action_friends_list:

                startActivity(new Intent(this, FriendsActivity.class));

                return true;

            case R.id.action_new_gathering:

                startActivity(new Intent(this, NewGatheringActivity.class));

                return true;

            case R.id.action_settings:

                startActivity(new Intent(this, SettingsActivity.class));

                return true;

            case R.id.action_profile:

                startActivity(new Intent(this, ProfileActivity.class));

                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
    }

}
