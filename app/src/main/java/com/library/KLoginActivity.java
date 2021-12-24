package com.library;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.library.Entities.UsersEntity;
import com.library.ViewModels.UsersViewModel;

import java.util.List;

public class KLoginActivity extends AppCompatActivity {
    //private UsersViewModel usersViewModel;
    //MyAdapter adapter = new MyAdapter();
    //EditText user_mail = (EditText) findViewById(R.id.K_login_email);

    // private UsersViewModel userviewmodel;
   // private AsyncListDiffer<UsersEntity> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_login);
        /*
        MyAdapter adapter = new MyAdapter();
        RecyclerView recyclerView = findViewById(R.id.book_recycle_view);
        recyclerView.setAdapter(adapter);
      UsersViewModel userViewModel = new ViewModelProvider(this).get(UsersViewModel.class);

        userViewModel.getLiveDataUsersEntity().observe(this, UserEntity -> {
            // Update the cached copy of the words in the adapter.
             adapter.SetUserEntity();
        });

         */




/*
        RecyclerView recyclerView = findViewById(R.id.book_recycle_view);
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
    }

    public void K_Create_Account(View v) {

        Intent intent = new Intent(this, KSihnupActivity .class);

        startActivity(intent);
    }

    public void Users_Login(View v) {
        EditText useremail = (EditText) findViewById(R.id.K_login_email);
        EditText usrpasswrd = (EditText) findViewById(R.id.k_login_password);
        TextView sms = (TextView) findViewById(R.id.K_LoginErrorShowi);

        String  usermail = useremail.getText().toString().trim();
        String userpaswrd = usrpasswrd.getText().toString().trim();


        if (usermail.equals("")){
            sms.setText("Enter Email");
            sms.setTextColor(Color.RED);

            return;
        }

        if (userpaswrd.equals("")) {
            sms.setText("Enter password");
            sms.setTextColor(Color.RED);
            usrpasswrd.requestFocus();
            return;
        }
        // ------------------Creating new Login Object---------------



        if(usermail.equals("yep")){

            Intent intent = new Intent(this, KWellcomeActivity.class);

            startActivity(intent);
        }

        else{
            sms.setText("incorret info");
            sms.setTextColor(Color.RED);
            }

    }

    public void ForgotPwrdPageopen(View v) {

        Intent intent = new Intent(this, KForgotActivity.class);

        startActivity(intent);
    }

}