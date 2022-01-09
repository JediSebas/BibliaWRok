package com.jedisebas.bibliawrok;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.jedisebas.bibliawrok.databinding.ActivityScrollingBinding;

public class ScrollingActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.jedisebas.bibliawrok.databinding.ActivityScrollingBinding binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        sharedPreferences = getSharedPreferences("info", 0);
        String isDone = sharedPreferences.getString("key", "false");

        if (isDone.equals("false")) {
            GreenDataBase db = Room.databaseBuilder(getApplicationContext(),
                    GreenDataBase.class, "database").build();
            GreenDao greenDao = db.greenDao();
        new Thread(() -> {for (int i=1; i<=330; i++) {
            GreenEntity gr = new GreenEntity();
            gr.id = i;
            gr.isGreen = "false";
            greenDao.insertGreenEntities(gr);
        }
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putString("key", "true").apply();
        }).start();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void begin(View view) {
        Intent intent;
        if (view.getId() == R.id.button) {
            intent = new Intent(ScrollingActivity.this, WholeProgramActivity.class);
            startActivity(intent);
        }
    }
}