package com.example.pintu.bestfriendapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class createAccount extends AppCompatActivity {
    private ProjectModel person;
    private EditText Name;
    private EditText Age;
    private EditText City;
    private EditText Hobby1;
    private EditText Hobby2;
    private EditText Userid;
    private EditText Password;

    private  Button Register;
    private  Button cancelbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Name =(EditText) findViewById(R.id.etName);
        Age =(EditText) findViewById(R.id.etAge);
        City =(EditText) findViewById(R.id.etCity);
        Hobby1 =(EditText) findViewById(R.id.etHobby1);
        Hobby2 =(EditText) findViewById(R.id.etHobby2);
        Userid =(EditText) findViewById(R.id.etUserid);
        Password =(EditText) findViewById(R.id.etPassword);

        Register = (Button) findViewById(R.id.btRegister);
        cancelbutton = (Button) findViewById(R.id.btCancel);
        person =new ProjectModel();

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //accepting input from user

                person.setName(Name.getText().toString());
                person.setAge(Integer.parseInt(Age.getText().toString()));
                person.setCity(City.getText().toString());
                person.setHobby1( Hobby1.getText().toString());
                person.setHobby2(Hobby2.getText().toString());
                person.setUsername(Userid.getText().toString());
                person.setPassword(Password.getText().toString());

               /*final String VName = Name.getText().toString();
                final int VAge = Integer.parseInt(Age.getText().toString());
                final String VCity = City.getText().toString();
                final String VHobby1 = Hobby1.getText().toString();
                final String VHobby2 = Hobby2.getText().toString();
                final String VUsername = Userid.getText().toString();
                final String VPassword = Password.getText().toString(); */

                Response.Listener<String> responseListener = new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);

                            boolean success = jsonResponse.getBoolean("success");
//                            //activity after successful insert of user data in database in RegisterRequest class
                            if (success) {
                                Intent intent = new Intent(createAccount.this, login.class);
                                createAccount.this.startActivity(intent);
                            }
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(createAccount.this);
                                builder.setMessage("Registration Failed.")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {

                            e.printStackTrace();
                        }

                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(person.getName(),person.getAge(),person.getCity(),
                        person.getHobby1(),person.getHobby2(),person.getUsername(),person.getPassword(), responseListener );
                RequestQueue queue = Volley.newRequestQueue(createAccount.this);
                queue.add(registerRequest);
            }
            }
        );
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelbuttonIntent = new Intent(createAccount.this, login.class);
                createAccount.this.startActivity(cancelbuttonIntent);
            }
        });


    }


}
