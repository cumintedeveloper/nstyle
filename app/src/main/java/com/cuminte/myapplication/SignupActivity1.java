package com.cuminte.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by abc on 08-03-2018.
 */

public class SignupActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_signup1);
        getSupportActionBar().hide();
        hideDefaultKeyboard();
    }

    public void next(View v){
        Intent intent=new Intent(getApplicationContext(),SignupActivity2.class);
        startActivity(intent);


    }
    private void hideDefaultKeyboard()
    {
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
