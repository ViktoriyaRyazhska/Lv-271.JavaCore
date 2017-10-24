package com.company.lesson3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {
/*
Create Console Application project in Java.
Add class Person to the project.
Class Person should consists of
two private fields: name and birthYear (the birthday year)
properties for access to these fields
default constructor and constructor with 2 parameters
methods:
age - to calculate the age of person
input - to input information about person
output - to output information about person
changeName - to change the name of person
In the method main() create 5 objects of Person type and input information about them.
*/

private String name;
private int birthYear;



//constructor with parameters
public Person(String name, int birthYear){
    this.birthYear = birthYear;
    this.name = name;
}
//constructor without parameters
    public Person(){ }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public void setBirthYear(int year){
        this.birthYear = year;
    }

//returns current age
    public int age(){
        if (this.birthYear > 0){
            return getCurrentYear() - getBirthYear();
        }
        return -1;
    }

//returns current year
    private int getCurrentYear(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date currentDate = new Date();
        return Integer.valueOf((dateFormat.format(currentDate)));
    }

    public void printer(){
        System.out.println("Name: " +  this.getName() + "\n" +
                           "BirthYear: " + this.getBirthYear() + "\n" +
                           "Current age is: " + this.age() + "\n");
    }

}
