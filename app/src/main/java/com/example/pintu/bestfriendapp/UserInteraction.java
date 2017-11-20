package com.example.pintu.bestfriendapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UserInteraction extends AppCompatActivity {

    // private Button CalculateStress;
    private ProjectModel person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interaction);
        person = new ProjectModel();


         final Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
         final ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(UserInteraction.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numbers));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        mySpinner2.setAdapter(myAdapter1);

        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);
        mySpinner3.setAdapter(myAdapter1);

        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner4);
        mySpinner4.setAdapter(myAdapter1);

        Spinner mySpinner5 = (Spinner) findViewById(R.id.spinner5);
        mySpinner5.setAdapter(myAdapter1);

        Spinner mySpinner6 = (Spinner) findViewById(R.id.spinner6);
        mySpinner6.setAdapter(myAdapter1);

        Spinner mySpinner7 = (Spinner) findViewById(R.id.spinner7);
        mySpinner7.setAdapter(myAdapter1);

        Spinner mySpinner8 = (Spinner) findViewById(R.id.spinner8);
        mySpinner8.setAdapter(myAdapter1);

        Spinner mySpinner9 = (Spinner) findViewById(R.id.spinner9);
        mySpinner9.setAdapter(myAdapter1);

        Spinner mySpinner10 = (Spinner) findViewById(R.id.spinner10);
        mySpinner10.setAdapter(myAdapter1);

        Spinner mySpinner11 = (Spinner) findViewById(R.id.spinner11);
        mySpinner11.setAdapter(myAdapter1);

        Spinner mySpinner12 = (Spinner) findViewById(R.id.spinner12);
        mySpinner12.setAdapter(myAdapter1);

        Spinner mySpinner13 = (Spinner) findViewById(R.id.spinner13);
        mySpinner13.setAdapter(myAdapter1);

        Spinner mySpinner14 = (Spinner) findViewById(R.id.spinner14);
        mySpinner14.setAdapter(myAdapter1);

        //Button CalculateStress = (Button) findViewById(R.id.btCalcStress);
        //CalculateStress.setOnClickListener(new View.OnClickListener() {
       // @Override

                /*Intent letsTalkbuttonIntent =
                        new Intent(UserInteraction.this, UserInteraction.class);
                UserInteraction.this.startActivity(letsTalkbuttonIntent);
*/
    }
    //   });

    public void calculatestress(View v) {
    person.questions=new ArrayList<Integer>();
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner1.getSelectedItem())));
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
       person.questions.add(Integer.parseInt(String.valueOf(mySpinner2.getSelectedItem())));
        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner3.getSelectedItem())));
        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner4);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner4.getSelectedItem())));
        Spinner mySpinner5 = (Spinner) findViewById(R.id.spinner5);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner5.getSelectedItem())));
        Spinner mySpinner6 = (Spinner) findViewById(R.id.spinner6);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner6.getSelectedItem())));
        Spinner mySpinner7 = (Spinner) findViewById(R.id.spinner7);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner7.getSelectedItem())));
        Spinner mySpinner8 = (Spinner) findViewById(R.id.spinner8);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner8.getSelectedItem())));
        Spinner mySpinner9 = (Spinner) findViewById(R.id.spinner9);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner9.getSelectedItem())));
        Spinner mySpinner10 = (Spinner) findViewById(R.id.spinner10);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner10.getSelectedItem())));
        Spinner mySpinner11 = (Spinner) findViewById(R.id.spinner11);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner11.getSelectedItem())));
        Spinner mySpinner12 = (Spinner) findViewById(R.id.spinner12);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner12.getSelectedItem())));
        Spinner mySpinner13 = (Spinner) findViewById(R.id.spinner13);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner13.getSelectedItem())));
        Spinner mySpinner14 = (Spinner) findViewById(R.id.spinner14);
        person.questions.add(Integer.parseInt(String.valueOf(mySpinner14.getSelectedItem())));


// sum= summ of all user answer options.
// percentage= calculate the stress percentage
        double sum=0.0;
        //double percentage=0;
        for(int i=0;i<14;i++)
        {
            sum=sum+person.questions.get(i);
        }
        int percentage=(int)Math.round((sum/140)*100) ;
   //     Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(),String.valueOf(percentage), Toast.LENGTH_SHORT).show();
/*
        AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
        builder.setTitle("Your Stress Level is :")
                .setMessage(String.valueOf(percentage))
                .setNegativeButton("OK", null)
                .create()
                .show();
*/

        if (percentage==0) {

            AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
            builder.setTitle("Stress Level is : " + String.valueOf(percentage))
                    .setMessage("Congratulations...!!!You are Stress free...!!!")
                    .setNegativeButton("OK", null)
                    .create()
                    .show();
        }

      else if (percentage>=1 && percentage <=30){

          AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
          builder.setTitle("Stress Level is : " + String.valueOf(percentage) )
                   .setMessage("You have LOW Stress Level.")
                  .setNegativeButton("OK", null)
                  .create()
                  .show();
      }
      else if (percentage>30 && percentage <=60) {
          AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
          builder.setTitle("Stress Level is : " + String.valueOf(percentage) )
                  .setMessage("You have Moderate Stress Level.")
                  .setNegativeButton("OK", null)
                  .create()
                  .show();
      }
      else if (percentage>60 && percentage <=90){
          AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
          builder.setTitle("Stress Level is : " + String.valueOf(percentage) )
                  .setMessage("You have High Stress Level.")
                  .setNegativeButton("OK", null)
                  .create()
                  .show();

      }
      else {
          AlertDialog.Builder builder = new AlertDialog.Builder(UserInteraction.this);
          builder.setTitle("Stress Level is : " + String.valueOf(percentage) )
                  .setMessage("You have Alarming Stress Level. Consult Doctor.")
                  .setNegativeButton("OK", null)
                  .create()
                  .show();
      }
    }

}



