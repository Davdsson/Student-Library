package com.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BookActivityPage extends AppCompatActivity {
    private TextView scnce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);
        scnce = findViewById(R.id.test);

        Intent secondintent = getIntent();
        String scientist = secondintent.getStringExtra("key");
        scnce.setText(scientist);
    }

}