package com.example.finalproject;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity_orign extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);ActivityCompat.requestPermissions(MainActivity_orign.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);
    }

    public void ContactsPage(View view){
        Intent intent = new Intent( this, ContactsPage.class) ;
        startActivity(intent    );

    }


    public void CallNumberPage(View view){
        Intent intent = new Intent( this, ContactsPage.class) ;
        startActivity(intent    );

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