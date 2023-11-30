package com.ajkhati.TravelPlanning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText mobile = findViewById(R.id.mobileET);
        final Button signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String getMobileTxt = mobile.getText().toString();


                // opening OTP Verification Activity along with mobile and email
                Intent intent = new Intent(Login.this, OtpVerify.class);

                intent.putExtra("mobile" , getMobileTxt);

                startActivity(intent);
            }
        });


    }
}