package com.example.muslimscientist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView detailsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsView = findViewById(R.id.detailsView);
        int i = getIntent().getIntExtra("AstronomyDetails", 999);

        if (i == 1){
            detailsView.setText("its working");
        }

        if(i==2)
        {
            detailsView.setText("al-farabi");
        }
        if(i==3)
        {
            detailsView.setText("al-fargani");
        }

        int b = getIntent().getIntExtra("BiologyDetails", 999);

        if (b == 1){
            detailsView.setText("Biology");
        }

        if (b == 2){
            detailsView.setText("ahmed reza");
        }


    }
}
