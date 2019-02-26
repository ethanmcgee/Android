package com.example.assignmenttwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String COUNT = "count";
    String RANDOM = "random";
    TextView mainNum;
    Button buttonAdd;
    Button buttonSub;

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make the buttons for add and subtract
        mainNum = (TextView) (findViewById(R.id.text_total_num));
        buttonAdd = (Button) findViewById(R.id.butAdd);
        buttonSub = (Button) findViewById(R.id.butSub);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                counter++;
                mainNum.setText(String.valueOf(counter));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                counter--;
                mainNum.setText(String.valueOf(counter));
            }


        });
    }
// menu instantiation
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        //call the other main activity

        switch (id) {
            case R.id.random:
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

                return true;

            default:
                return true;
        }

    }

}
