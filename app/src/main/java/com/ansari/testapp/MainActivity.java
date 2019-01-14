package com.ansari.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    EditText usernameEditText;
    TextView userTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.buttonClick);
        usernameEditText = findViewById(R.id.editTextUsername);
        userTextView = findViewById(R.id.buttonClick);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             String username =   usernameEditText.getText().toString();
                Toast.makeText(MainActivity.this,
                        "username is " + username,Toast.LENGTH_LONG  ).show();
                //int a = 10/0;
                userTextView.setText(username);

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                myIntent.putExtra("mykey",username);

                startActivity(myIntent);
        }
        });
    }
}
