package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.Manifest;
import android.telephony.SmsManager;
import android.content.pm.PackageManager;
//import android.support.v4.app.ActivityCompat;
//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_page);ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
    }

    public void SendSmsPage(View view){
        Intent intent = new Intent( this, Sms.class) ;
        startActivity(intent    );

    }

    public void InformationPage(View view){
        Intent     intent = new Intent( this, Information.class) ;
        startActivity(intent   );

    }
}