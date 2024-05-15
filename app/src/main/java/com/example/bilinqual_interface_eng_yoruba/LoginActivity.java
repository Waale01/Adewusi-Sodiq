package com.example.bilinqual_interface_eng_yoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView btnProceed = findViewById(R.id.btn_login);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the activity_converter activity
                startActivity(new Intent(LoginActivity.this, ConverterActivity.class));
            }
        });
    }
}