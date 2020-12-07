package com.marshmallow.iamhungry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    Button signUpCreateBtn, signUpBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpCreateBtn = findViewById(R.id.signUpCreateBtn);
        signUpBackBtn = findViewById(R.id.signUpBackBtn);

        signUpCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_toSignInActivity= new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intent_toSignInActivity);
            }
        });

        signUpBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_toMainSignActivity= new Intent(getApplicationContext(), MainSignActivity.class);
                startActivity(intent_toMainSignActivity);
            }
        });
    }
}
