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

    public void login(View view) {
        EditText usernameET = findViewById(R.id.usernameET);
        EditText passwordET = findViewById(R.id.passwordET);

        Log.i("Username", usernameET.getText().toString());
        Log.i("Passwort", passwordET.getText().toString());
    }
}
