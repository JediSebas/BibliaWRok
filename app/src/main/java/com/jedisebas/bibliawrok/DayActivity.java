package com.jedisebas.bibliawrok;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.room.Room;

import com.jedisebas.bibliawrok.databinding.ActivityDayBinding;

import java.util.Objects;

public class DayActivity extends AppCompatActivity {

    static String sigle, number, linkToWebsite;
    static void makeStr(String s, String s2, String s3) {
        sigle = s;
        number = s2;
        linkToWebsite = s3;
    }

    TextView textView, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.jedisebas.bibliawrok.databinding.ActivityDayBinding binding = ActivityDayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        textView = findViewById(R.id.sigleTv);
        link = findViewById(R.id.linkTv);
        textView.setText(sigle);
        String linkText = "<a href='" + linkToWebsite + "'>Tutaj wersja online</a>";
        link.setText(Html.fromHtml(linkText));
        link.setMovementMethod(LinkMovementMethod.getInstance());

        GreenDataBase db = Room.databaseBuilder(getApplicationContext(),
                GreenDataBase.class, "database").build();

        GreenDao greenDao = db.greenDao();

        binding.fab.setOnClickListener(view -> {
            Intent intent = new Intent(DayActivity.this, WholeProgramActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            AsyncTask.execute(() -> {GreenEntity gr = new GreenEntity();
                gr.id = Integer.parseInt(number);
                boolean b = Boolean.parseBoolean(greenDao.getIsGreen(Integer.parseInt(number)));
                b = !b;
                gr.isGreen = String.valueOf(b);
                greenDao.updateGreenEntity(gr);});

            startActivity(intent);
        });

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Dzień " + number);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(DayActivity.this, WholeProgramActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}