package com.example.muslimscientist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        String[] MuslimScientist = getResources().getStringArray(R.array.MuslimScientist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sampleview,R.id.textViewId,MuslimScientist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0 )
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist", 1);
                    startActivity(intent);
                }

                if (position == 1)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist", 2);
                    startActivity(intent);
                }

                if (position == 2)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",3);
                    startActivity(intent);
                }

                if (position == 3)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",4);
                    startActivity(intent);
                }

                if (position == 4)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",5);
                    startActivity(intent);
                }

                if (position == 5)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",6);
                    startActivity(intent);
                }

                if (position == 6)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",7);
                    startActivity(intent);
                }

                if (position == 7)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",8);
                    startActivity(intent);
                }


                if (position == 8)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",9);
                    startActivity(intent);
                }

                if (position == 9)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",10);
                    startActivity(intent);
                }

                if (position == 10)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",11);
                    startActivity(intent);
                }

                if (position == 11)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",12);
                    startActivity(intent);
                }

                if (position == 12)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",13);
                    startActivity(intent);
                }

                if (position == 13)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",14);
                    startActivity(intent);
                }

                if (position == 14)
                {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Scientist",15);
                    startActivity(intent);
                }

            }
        });


    }
}
