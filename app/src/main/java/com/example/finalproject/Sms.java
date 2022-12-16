package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sms extends AppCompatActivity {
    private EditText editTextNumber;
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        editTextMessage = findViewById(R.id.editTextTextMultiLine);
        editTextNumber = findViewById(R.id.editTextNumber2);
    }

    public void sendSMS(View view){

        String message = editTextMessage.getText().toString();
        String number = editTextNumber.getText().toString();
        editTextNumber.setText("");
        editTextMessage.setText("");
        SmsManager mySmsManager = SmsManager.getDefault();
        mySmsManager.sendTextMessage(number,null, message, null, null);
        Toast.makeText(this, "Message was sent successfully", Toast.LENGTH_SHORT).show();

    }
}