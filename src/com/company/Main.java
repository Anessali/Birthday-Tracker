package com.company;
import java.util.*;
import static java.lang.System.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	    // Main method variables
        boolean runProgram = true;
        String firstName, lastName;
        String[] test = {"Test"};
        int choice;
        List<Person> people = new ArrayList<>();
        Scanner read = new Scanner(in);
        Date thisDate = new Date();

        while(runProgram) {
            try{
                //Menu
                out.println("Select an option. Type 'exit' to quit.");
                out.println("1.\tAdd a Birthday");
                out.println("2.\tList Birthdays");
                out.println("3.\tDebug");
                out.println("4.\tExit");
                choice = Integer.parseInt(read.nextLine());

                switch(choice){
                    case 1:
                        out.print("Enter first name: ");
                        firstName = read.nextLine();
                        out.print("Enter last name: ");
                        lastName = read.nextLine();
                        Person newPerson = new Person(firstName, lastName);
                        people.add(newPerson);
                        break;
                    case 2:
                        for (Person person : people) {
                            out.println(person.firstName);
                        }
                        break;
                    case 3:
                        /*  Tutorial followed: https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm  */
                        //setting up DocumentBuilder
                        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder builder = factory.newDocumentBuilder();

                        //creating document from file
                        StringBuilder xmlString = new StringBuilder();
                        xmlString.append("<?xml version='1.0'?> <People> </People>");
                        ByteArrayInputStream input =
                            new ByteArrayInputStream(xmlString.toString().getBytes("UTF-8"));
                        Document doc = builder.parse(input);

                        //extract root element
                        Element root = doc.getDocumentElement();

                        //returns attribute
                        out.print(root.getAttribute("Person"));

                        NodeList nList = doc.getElementsByTagName("Name");
                        out.println(nList.item(0));

//                    Person newPerson = new Person(firstName, lastName);
//                    out.println(newPerson.firstName);
//                    out.println(newPerson.lastName);
                        break;
                    case 4:
                        runProgram = false;
                        break;
                    default:
                        out.println("Error. Enter a valid option.");
                        break;
                }
            } catch(Exception e) {
                out.println("Please enter a valid option.");
            }

        }
    }
}
