package com.example.gillingham.pmt;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

    public void launchMaps(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void popUpShow(View view) {
        String[] colors = {"1 day", "7 Days", "2 Weeks", "1 Month"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("How long do you want to sponsor for.");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }
}
