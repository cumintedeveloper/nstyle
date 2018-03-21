package com.cuminte.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by abc on 08-03-2018.
 */

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_menu);
        getSupportActionBar().hide();
    }

    public void login(View v){
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
    public void signup(View v){
        Intent intent=new Intent(this,SignupActivity1.class);
        startActivity(intent);
    }
    public  void home(View v){
        Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }
    public  void call(View v){
        Intent intent=new Intent (getApplicationContext(),CallActivity.class);
        startActivity(intent);
    }
    public void navigation(View v){

        Intent intent=new Intent(getApplicationContext(),Navigation.class);
        startActivity(intent);
    }
}
