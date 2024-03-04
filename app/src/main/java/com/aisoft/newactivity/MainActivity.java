package com.aisoft.newactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button contactButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        contactButton = findViewById(R.id.contactButton);



        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, ContactPage.class);
                startActivity(myIntent);
                Toast.makeText(MainActivity.this, "Welcome to my Contact Page.!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}