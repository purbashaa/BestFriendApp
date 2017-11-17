package com.example.pintu.bestfriendapp;

import java.util.ArrayList;

/**
 * Created by Pintu on 11/16/2017.
 */

public class ProjectModel {

        private String name;
               public void setName(String name) {
               this.name = name;
    }
               public String getName() {
               return name;
            }

        private int age;
                public void setAge(int age) {
                this.age = age;
        }
                public int getAge() {
                 return age;
        }

         private String city;
                public String getCity() {
                 return city;
        }
                public void setCity(String city) {
                 this.city = city;
        }

         private String hobby1;
                public String getHobby1() {
                  return hobby1;
        }
                public void setHobby1(String hobby1) {
                  this.hobby1 = hobby1;
        }

         private String hobby2;
                public void setHobby2(String hobby2) {
                    this.hobby2 = hobby2;
    }
                public String getHobby2() {
                   return hobby2;
        }

         private String username;
                 public void setUsername(String username) {
                     this.username = username;
                 }
                 public String getUsername() {
                     return username;
        }

          private String password;
                 public void setPassword(String password) {
                    this.password = password;
    }
                 public String getPassword() {
                    return password;
        }


          private ArrayList<Integer> questions;
                  public void setQuestions(ArrayList<Integer> questions) {
                       this.questions = questions;
        }




    }

