package com.company;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    String firstName, lastName;

    public Person(String firstName, String lastName){
//        this.firstName = firstName;
//        setFirstName(firstName);
//        getFirstName();
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Initializing new birthday...");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
    public void setFirstName(String firstName){
        firstName = firstName;
    }
     public String getFirstName() {
        System.out.println("First name set...");
        return firstName;
    }
}