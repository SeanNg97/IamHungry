package com.marshmallow.iamhungry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    Button signinLoginBtn, signinBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signinLoginBtn = findViewById(R.id.signinLoginBtn);
        signinBackBtn = findViewById(R.id.signinBackBtn);

        signinLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_toMainActivity= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_toMainActivity);
            }
        });

        signinBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_toMainSignActivity= new Intent(getApplicationContext(), MainSignActivity.class);
                startActivity(intent_toMainSignActivity);
            }
        });
    }
}
