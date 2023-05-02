package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class wishlistactivity extends AppCompatActivity {
    LinearLayout linwish;
=======
import android.os.Bundle;

public class wishlistactivity extends AppCompatActivity {
>>>>>>> 1d368a3821bb3be74bd7e826e05c7f4528247feb

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlistactivity);
<<<<<<< HEAD
        Initview();
    }

    private void Initview() {
        linwish=findViewById(R.id.linwish);
        linwish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent E=new Intent(wishlistactivity.this,categories3.class);
                startActivity(E);
            }
        });
=======
>>>>>>> 1d368a3821bb3be74bd7e826e05c7f4528247feb
    }
}