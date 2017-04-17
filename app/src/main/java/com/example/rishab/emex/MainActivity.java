package com.example.rishab.emex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.rishab.emex.R.id.btn_login;

/**
 * activity
 */
public class MainActivity extends AppCompatActivity {
    static final int SPLASH_DISPLAY_LENGTH = 2000;
    private Button btnlogin1;
    private Button btnsignUp1;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin1 = (Button) findViewById(btn_login);
        btnsignUp1 = (Button) findViewById(R.id.btn_signup);
        // init();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnlogin1.setVisibility(View.VISIBLE);
                btnsignUp1.setVisibility(View.VISIBLE);
            }
        }, SPLASH_DISPLAY_LENGTH);

        btnlogin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        btnsignUp1.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}



