package com.cuminte.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }


    public void menu(View v){

        Intent intent=new Intent(getApplicationContext(),Menu.class);
        startActivity(intent);
    }
    public void profile(View v){

        Intent intent=new Intent(getApplicationContext(),Myprofile.class);
        startActivity(intent);
    }
    public void call(View v){
        Intent intent=new Intent (getApplicationContext(),CallActivity.class);
        startActivity(intent);

    }
    public void book(View v){
        Intent intent=new Intent(getApplicationContext(),BookNow.class);
        startActivity(intent);
    }

}
