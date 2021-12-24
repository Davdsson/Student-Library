package com.library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.library.Entities.UsersEntity;
import com.library.ViewModels.UsersViewModel;

import java.util.List;

public class KWellcomeActivity extends AppCompatActivity {
   // private UsersViewModel usersViewModel;
    //EditText user_mail = (EditText) findViewById(R.id.K_login_email);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwellcome);

       /* RecyclerView recyclerView = findViewById(R.id.book_recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        usersViewModel = ViewModelProviders.of(this).get(UsersViewModel.class);
        usersViewModel.findUserByEmail(user_mail.toString().trim()).observe(this, new Observer<List<UsersEntity>>() {
            @Override
            public void onChanged(List<UsersEntity> usersEntities) {

                adapter.SetUserEntity();

            }
        });

        */


        TextView gmail = (TextView) findViewById(R.id.googl);
        gmail.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkedin = (TextView) findViewById(R.id.linkedin);
        linkedin.setMovementMethod(LinkMovementMethod.getInstance());

        TextView face = (TextView) findViewById(R.id.facebook);
        face.setMovementMethod(LinkMovementMethod.getInstance());

        TextView insta = (TextView) findViewById(R.id.instagram);
        insta.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void Select_Science_Books(View v) {

        String value = "The Best Science Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Literature_Book(View v) {

        String value = "The Literature Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Coding_Book(View v) {

        String value = "The Best Programming Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Network_Book(View v) {

        String value = "The Computer Network Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Security_Book(View v) {

        String value = "The Best Hacking Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Technology_Book(View v) {

        String value = "Discovre The World of Technology";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Architecture_Book(View v) {

        String value = "The Best Civil Engineering Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Engineering_Book(View v) {

        String value = "The Top Of Engineering Books";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }

    public void Select_Art_Book(View v) {

        String value = "The World Of Artists";
        Intent intent = new Intent(KWellcomeActivity.this, BookActivityPage.class);
        intent.putExtra("key", value);

        startActivity(intent);

    }
}