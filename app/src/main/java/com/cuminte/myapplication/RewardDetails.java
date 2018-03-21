package com.cuminte.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by abc on 19-03-2018.
 */

public class RewardDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_balance);
        getSupportActionBar().hide();
        hideDefaultKeyboard();
    }

    private void hideDefaultKeyboard()
    {
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
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
