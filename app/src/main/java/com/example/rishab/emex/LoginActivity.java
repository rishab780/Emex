package com.example.rishab.emex;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;



/**
 * Created by Rishab on 13-04-2017.
 */

public class LoginActivity extends AppCompatActivity {
    private Button btlogin2;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        btlogin2 = (Button) findViewById(R.id.btn_login);
        btlogin2.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }

}

