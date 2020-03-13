package com.example.appchallenge;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buttonchallenge.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void meinClickEvent(View view) {
        EditText username = findViewById(R.id.username);
        EditText passwort = findViewById(R.id.passwort);

        Log.i("Name", username.getText().toString());
        Log.i("Passwort", passwort.getText().toString());
    }
}
