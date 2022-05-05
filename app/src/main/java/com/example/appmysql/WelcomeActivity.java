package com.example.appmysql;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView tvname,tvemail;
    private Button btnlogout;
    private PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        preferenceHelper = new PreferenceHelper(this);

        tvemail = (TextView) findViewById(R.id.tvemail);
        tvname = (TextView) findViewById(R.id.tvname);
        btnlogout = (Button) findViewById(R.id.btn);

        tvname.setText("Welcome "+preferenceHelper.getName());
        tvemail.setText("Your email is "+preferenceHelper.getEmail());

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferenceHelper.putIsLogin(false);
                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        });
    }
}
