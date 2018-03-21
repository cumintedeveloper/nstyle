package com.cuminte.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * Created by abc on 10-03-2018.
 */

public class BookNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_now);
        getSupportActionBar().hide();

    }

    public  void home(View v){
        Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

    public  void call(View v){
        Intent intent=new Intent (getApplicationContext(),CallActivity.class);
        startActivity(intent);
    }

    public void booknow(View v){

    }

    public void navigation(View v){
        Intent intent=new Intent(getApplicationContext(),Navigation.class);
        startActivity(intent);
    }

}