package com.cuminte.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by abc on 09-03-2018.
 */

public class Navigation extends AppCompatActivity {

    ImageView cross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        cross=findViewById(R.id.cross);
        getSupportActionBar().hide();

        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    public void service(View v){

        Intent i=new Intent(this,Menu.class);
        startActivity(i);
    }


    public void gift(View v){
        try {
//            Intent i = new Intent(this, Promotion.class);
//            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void promotion(View v){

        Intent i=new Intent(this,Promotion.class);
        startActivity(i);
    }

    public void location(View v){

        try {
//            Intent i = new Intent(this, Promotion.class);
//            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void feedback(View v){

    Intent i=new Intent(this,Feedback.class);
    startActivity(i);
}


    public void contactus(View v) {
        try {
//            Intent i = new Intent(this, Promotion.class);
//            startActivity(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
