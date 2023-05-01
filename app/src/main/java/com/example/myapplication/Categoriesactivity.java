package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Categoriesactivity extends AppCompatActivity {
    LinearLayout Discount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoriesactivity);
        Initview();
    }

    private void Initview() {
        Discount=findViewById(R.id.Discount);
        Discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B=new Intent(Categoriesactivity.this,discount123activiy.class);
                startActivity(B);
            }
        });
    }
}