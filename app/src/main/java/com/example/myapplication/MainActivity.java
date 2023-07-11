package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private Button btnlist;
    private FloatingActionButton fbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlist = findViewById(R.id.button2);
        fbtn = findViewById(R.id.btnFloat);
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "KOMINFO Float Button", Toast.LENGTH_SHORT).show();
            }
        });
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ListBook.class);
                i.putExtra("Data", "Welcom Guysss");
                startActivity(i);
            }
        });

    }
}