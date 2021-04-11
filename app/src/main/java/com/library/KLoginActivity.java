package com.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class KLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_login);
    }

    public void K_Create_Account(View v) {

        Intent intent = new Intent(this, KSihnupActivity .class);

        startActivity(intent);
    }

    public void Users_Login(View v) {
        EditText useremail = (EditText) findViewById(R.id.K_login_email);
        EditText usrpasswrd = (EditText) findViewById(R.id.k_login_password);
        TextView sms = (TextView) findViewById(R.id.K_LoginErrorShow);

        String usermail = useremail.getText().toString().trim();
        String userpaswrd = usrpasswrd.getText().toString().trim();


        if (usermail.equals("")) {
            sms.setText("Enter Email");
            sms.setTextColor(Color.RED);
            useremail.requestFocus();
            return;
        }

        if (userpaswrd.equals("")) {
            sms.setText("Enter password");
            sms.setTextColor(Color.RED);
            usrpasswrd.requestFocus();
            return;
        }
        // ------------------Creating new Login Object---------------
        Users loger = new Users();
        loger.Users_is_Loging_Account(usermail, userpaswrd);

       /*
        if(usermail.equals("yepess1er@gmail.com")&& userpaswrd.equals("1234")){
            //Intent intent = new Intent(this, HomeActivity.class);
           // startActivity(intent);}
           else{
            sms.setText("incorret info");
            sms.setTextColor(Color.RED);
            }
       */




    }

    public void ForgotPwrdPageopen(View v) {

        Intent intent = new Intent(this, KForgotActivity.class);

        startActivity(intent);
    }







}