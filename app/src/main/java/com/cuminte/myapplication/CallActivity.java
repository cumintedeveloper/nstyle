package com.cuminte.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by abc on 08-03-2018.
 */

public class CallActivity extends Activity {
    EditText call_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);
        call_text = findViewById(R.id.phone_number);
    }

    public void Call(View v) {
        try {
            String number = call_text.getText().toString();
            Intent phoneIntent = new Intent(Intent.ACTION_CALL);
            phoneIntent.setData(Uri.parse("tel:" + number));
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                return;
            }
            startActivity(phoneIntent);


        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(CallActivity.this,
                    "Call failed, please try again later!", Toast.LENGTH_SHORT).show();
        }
    }

    public void cancel(View v){

        try{
            onBackPressed();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

