package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class homepage extends AppCompatActivity {
    LinearLayout home,Categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        initview();
    }

    private void initview() {
        Categories=findViewById(R.id.Categories);
        Categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A=new Intent(homepage.this,Categoriesactivity.class);
                startActivity(A);
            }
        });
    }
}