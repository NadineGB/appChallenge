package com.example.appchallenge;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText usernameET = findViewById(R.id.usernameET);
        EditText passwordET = findViewById(R.id.passwordET);
        ImageView imgView = findViewById(R.id.logo);

        Log.i("Username", usernameET.getText().toString());
        Log.i("Passwort", passwordET.getText().toString());

        Toast.makeText(this, "Hallo " + usernameET.getText().toString(), Toast.LENGTH_LONG).show();
        imgView.setImageResource(R.drawable.cat);
    }
}
