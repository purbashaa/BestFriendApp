package com.example.pintu.bestfriendapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button logoutbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoutbutton = (Button) findViewById(R.id.btLogout);


        logoutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutbuttonIntent = new Intent(MainActivity.this, login.class);
                MainActivity.this.startActivity(logoutbuttonIntent);
            }
        });

    }
}
