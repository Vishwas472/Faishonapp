package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class disscount_Activity extends AppCompatActivity {
    TextView txtkids;
=======
import android.os.Bundle;

public class disscount_Activity extends AppCompatActivity {
>>>>>>> 1d368a3821bb3be74bd7e826e05c7f4528247feb

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disscount);
<<<<<<< HEAD
        Initview();
    }

    private void Initview() {
        txtkids=findViewById(R.id.txtkids);
        txtkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent D=new Intent(disscount_Activity.this,categories3.class);
                startActivity(D);
            }
        });
=======
>>>>>>> 1d368a3821bb3be74bd7e826e05c7f4528247feb
    }
}