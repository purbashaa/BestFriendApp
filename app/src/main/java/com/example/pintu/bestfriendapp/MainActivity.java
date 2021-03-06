package com.example.pintu.bestfriendapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Age;
    private EditText City;
    private EditText Hobby1;
    private EditText Hobby2;
    private EditText Userid;
    private ProjectModel person;


    private Button letsTalkbutton;
    private Button logoutbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person = new ProjectModel();


        Name =(EditText) findViewById(R.id.etName);
        Age =(EditText) findViewById(R.id.etAge);
        City =(EditText) findViewById(R.id.etCity);
        Hobby1 =(EditText) findViewById(R.id.etHobby1);
        Hobby2 =(EditText) findViewById(R.id.etHobby2);
        Userid =(EditText) findViewById(R.id.etUserid);

        //receiving data after existing account check , Login.setOnClickListener
        Intent intent = getIntent();

        person.setName( intent.getStringExtra("name"));
        person.setAge(intent.getIntExtra("age",-1));
        person.setCity(intent.getStringExtra("city"));
        person.setHobby1(intent.getStringExtra("hobby_1"));
        person.setHobby2(intent.getStringExtra("hobby_2"));
        person.setUsername(intent.getStringExtra("username"));

        /*String VName = intent.getStringExtra("name");
        int VAge = intent.getIntExtra("age",-1);
        String VCity = intent.getStringExtra("city");
        String VHobby1 = intent.getStringExtra("hobby_1");
        String VHobby2 = intent.getStringExtra("hobby_2");
        String VUsername = intent.getStringExtra("username");*/

        //Displaying user data received from database

        Name.setText(person.getName());
        Age.setText(person.getAge()+"");
        City.setText(person.getCity());
        Hobby1.setText(person.getHobby1());
        Hobby2.setText(person.getHobby2());
        Userid.setText(person.getUsername());
        /*Name.setText(VName);
        Age.setText(VAge + "");
        City.setText(VCity);
        Hobby1.setText(VHobby1);
        Hobby2.setText(VHobby2);
        Userid.setText(VUsername);*/

        //calls the UserInteraction class
        letsTalkbutton = (Button) findViewById(R.id.btTalk);
        letsTalkbutton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  Intent letsTalkbuttonIntent =
                                                          new Intent(MainActivity.this, UserInteraction.class);
                                                  MainActivity.this.startActivity(letsTalkbuttonIntent);

                                              }
                                          });


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
