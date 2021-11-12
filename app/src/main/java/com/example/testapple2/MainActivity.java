package com.example.testapple2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton kkLogin = (ImageButton) findViewById(R.id.kakaoLogin);
        ImageButton fbLogin = (ImageButton) findViewById(R.id.facebookLogin);
        ImageButton hpLogin = (ImageButton) findViewById(R.id.hotpleLogin);

        kkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}