package com.example.muslimscientist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Collections;

public class SecondActivity extends AppCompatActivity {

    ListView secondView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondView = findViewById(R.id.secondview);

           int i = getIntent().getIntExtra("Scientist", 999);

            if (i == 1) {
                String[] Astronomy = getResources().getStringArray(R.array.astronomy);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SecondActivity.this, R.layout.sampleview, R.id.textViewId, Astronomy);
                secondView.setAdapter(adapter);

                secondView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {

                        if (position == 0)
                        {
                            Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                            intent.putExtra("AstronomyDetails", 1);
                            startActivity(intent);
                        }

                        if (position == 1)
                        {
                            Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                            intent.putExtra("AstronomyDetails", 2);
                            startActivity(intent);
                        }

                        if (position == 2)
                        {
                            Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                            intent.putExtra("AstronomyDetails", 3);
                            startActivity(intent);
                        }


                    }
                });
            }

            else if (i == 2) {
                String[] Biology = getResources().getStringArray(R.array.biology);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SecondActivity.this, R.layout.sampleview, R.id.textViewId, Biology);
                secondView.setAdapter(adapter);

                secondView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {

                        if (position == 0){
                            Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                            intent.putExtra("BiologyDetails", 1);
                            startActivity(intent);

                        }


                        if (position == 1){
                            Intent intent = new Intent(SecondActivity.this, DetailsActivity.class);
                            intent.putExtra("BiologyDetails", 2);
                            startActivity(intent);

                        }
                    }
                });

            }

            else if (i == 3)
            {
                String[] chemist = getResources().getStringArray(R.array.chemist);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SecondActivity.this, R.layout.sampleview, R.id.textViewId, chemist);
                secondView.setAdapter(adapter);

            }
        }



    }

