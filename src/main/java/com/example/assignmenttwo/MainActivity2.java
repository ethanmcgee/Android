package com.example.assignmenttwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView mainView2;
    TextView mainNum2;
    Button buttonRdn;
    Random rand = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //make random button interact

        mainView2 = (TextView) (findViewById(R.id.text_random));
        mainNum2 = (TextView) (findViewById(R.id.text_random_num));
        buttonRdn = (Button) findViewById(R.id.butRandom);

        buttonRdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                randomNumber = rand.nextInt(99 - 0) + 0;
                mainNum2.setText(String.valueOf(randomNumber));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.butAdd:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);
                return true;

            default:
                return true;
        }


    }
}

