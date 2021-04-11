package com.library;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class KSihnupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_sihnup);
    }
    public void Create_User_Account(View v) {

        //---------- Data Member İD TAKİNG------------------
        EditText firtname = (EditText) findViewById(R.id.k_name);
        EditText lastnme = (EditText) findViewById(R.id.k_lastname);
        EditText mail = (EditText) findViewById(R.id.k_Email);
        EditText usernme = (EditText) findViewById(R.id.k_username);
        EditText telphone = (EditText) findViewById(R.id.k_phone);
        EditText motdepasse = (EditText) findViewById(R.id.k_Regist_password);

        // RadioButton rbMale, rbFemale;
        // RadioGroup rgGender = null;
        //rgGender =  findViewById(R.id.rgGender);
        // rbMale = findViewById(R.id.mal);
        //rbFemale =  findViewById(R.id.famel);

        TextView choError = (TextView) findViewById(R.id.k_Erreur_display);

        String k_nom = firtname.getText().toString().trim();
        String k_prenom = lastnme.getText().toString().trim();
        String k_mail = mail.getText().toString().trim();
        String spwrd = motdepasse.getText().toString().trim();
        String k_username = usernme.getText().toString().trim();
        String k_phne = telphone.getText().toString().trim();
        //String gender="";
        /*if (rgGender.getCheckedRadioButtonId()!=-1)
        {
            if (rgGender.getCheckedRadioButtonId()==R.id.mal)
            {
                gender="Male";
            }
            else
            {
                gender = "Female";
            }
        }
        */

        if (k_nom.equals("")) {
            choError.setText("please enter Firstname");
            choError.setTextColor(Color.RED);
            return;
        }

        if (k_prenom.equals("")) {
            choError.setText("please enter Lastname");
            choError.setTextColor(Color.RED);
            return;
        }

        if (k_mail.equals("")) {
            choError.setText("please enter Email");
            choError.setTextColor(Color.RED);
            return;
        }

        if (k_username.equals("")) {
            choError.setText("please enter username");
            choError.setTextColor(Color.RED);
            return;
        }

        if (motdepasse.equals("")) {
            choError.setText("please enter Password");
            choError.setTextColor(Color.RED);
            return;
        }

        if (k_phne.equals("")) {
            choError.setText("please enter Number");
            choError.setTextColor(Color.RED);
            return;
        }

        //------------- Creating New Users Object To ADD TO DATA BASE--------------------

        Users newUser = new Users(k_nom,k_prenom,k_mail,k_username,motdepasse.toString().trim(),k_phne);

    }
}