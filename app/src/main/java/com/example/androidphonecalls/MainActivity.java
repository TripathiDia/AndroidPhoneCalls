package com.example.androidphonecalls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = findViewById(R.id.btnCall);

        call.setOnClickListener(view -> {
            //Import intent class.
            // Action_call is a function within intent class which is required to call calling functionality.
            // uri is required to pass with a by default static value
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel: 9999999999"));
        });
    }
}
