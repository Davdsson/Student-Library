package com.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-----------------------------------------------------
        button = (Button) findViewById(R.id.btKullanicilar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKullaniciActivity();
            }
        });
        //--------------------------------------------------------------
        button = (Button) findViewById(R.id.btAdmin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminActivity();
            }
        });
        //--------------------------------------------------------------
    }
    public void openKullaniciActivity() {
        Intent intent = new Intent(this, KLoginActivity.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------
    public void openAdminActivity() {
        Intent intent = new Intent(this, ALoginActivity.class);
        startActivity(intent);
    }
    //-----------------------------------------------------------------------------
}