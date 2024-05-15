package com.example.bilinqual_interface_eng_yoruba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageView btnProceed = findViewById(R.id.btn_register);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the activity_converter activity
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }
}