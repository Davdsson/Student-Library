package com.library;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class KForgotActivity extends AppCompatActivity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_forgot);
    }

    public void UersChangeİsPassword(View v){


        EditText ForgotenTextBox = (EditText) findViewById(R.id.kforgotenPwrdTextBox);
        TextView TexboxEmptiSms    = (TextView) findViewById(R.id.GotenPwrdsms);

        String Forgotenpwrd     = ForgotenTextBox.getText().toString().trim();

        if(Forgotenpwrd.equals("")){
            TexboxEmptiSms.setText("Fill the gap");
            TexboxEmptiSms.setTextColor(Color.BLACK);
            return;
        }
        else{
           // MessageDialog newobject = new MessageDialog();
           // newobject.MessageDialog();
            builder = new AlertDialog.Builder(this);

            builder.setMessage(" password Reset link has been sent to your email adress");

            AlertDialog alert = builder.create();
            //Setting the title manually

            alert.setTitle("Password Reset Email");
            alert.show();

        }
    }




}