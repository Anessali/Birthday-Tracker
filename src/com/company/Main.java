package com.company;
import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	    // Main method variables
        boolean runProgram = true;
        String firstName, lastName;
        String[] test = {"Test"};
        String choice;
        List<Person> people = new ArrayList<>();
        Scanner read = new Scanner(in);
        Date thisDate = new Date();

        while(runProgram) {

            //Menu
            out.println("Select an option. Type 'exit' to quit.");
            out.println("1.\tAdd a Birthday");
            out.println("2.\tList Birthdays");
            out.println("3.\tDebug");
            choice = read.nextLine();
            if(choice.equals("1")){
                out.print("Enter first name: ");
                firstName = read.nextLine();
                out.print("Enter last name: ");
                lastName = read.nextLine();
                Person newPerson = new Person(firstName, lastName);
                people.add(newPerson);
            }
            else if(choice.equals("2")){
                for (Person person : people) {
                    out.println(person.firstName);
                }
            }
            else if(choice.equals("3")) {
                firstName = "test1";
                lastName = "test2";
                Person newPerson = new Person(firstName, lastName);
                out.println(newPerson.firstName);
                out.println(newPerson.lastName);
            }
            //exits loop
            else if(choice.equals("exit")){
                runProgram = false;
            }
            else {
                out.println("Error. Enter a valid option.");
            }
        }
    }
}
