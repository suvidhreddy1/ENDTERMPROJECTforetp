package com.example.endtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ratingg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingg);
        final RatingBar rb=findViewById(R.id.rb1);
        final Button b=findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=rb.getRating();
                Toast.makeText(getApplicationContext(),"Rating is:"+a,Toast.LENGTH_LONG).show();
                int b=rb.getNumStars();
                Toast.makeText(getApplicationContext(),"Number of stars is:"+b,Toast.LENGTH_LONG).show();
                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
            }
        });
    }

}
