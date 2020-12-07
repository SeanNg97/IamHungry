package com.marshmallow.iamhungry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainSignActivity extends AppCompatActivity {


    Button splashSignInBtn, splashSignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sign);

        splashSignInBtn = findViewById(R.id.splashSignInBtn);
        splashSignUpBtn = findViewById(R.id.splashSignUpBtn);


        splashSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signIn= new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent_signIn);
            }
        });

        splashSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signUp = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent_signUp);
            }
        });


    }
}
