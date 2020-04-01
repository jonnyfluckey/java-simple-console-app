package com.jonnyfluckey.simpleconsoleapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.println("What's your name?");

        String personName = myObj.nextLine().trim();
        Person person1 = new Person();
        person1.addName(personName);
        System.out.println("Hi " + person1.name + ", How old are you?");

        int personAge = myObj.nextInt();
        myObj.nextLine();
        person1.addAge(personAge);

        if(personAge < 20)
            System.out.println(person1.age + "? My My you are young!");
        else if(personAge < 40)
            System.out.println(person1.age + "? The prime of your life!");
        else
            System.out.println("You are so old, you broke the system!");

        System.out.println("What is your favorite color?");
        String personFavoriteColor = myObj.nextLine().trim().toLowerCase();
        personFavoriteColor.toLowerCase();
        person1.addFavoriteColor(personFavoriteColor);

        switch(personFavoriteColor) {
            case "red":
                System.out.println("Go Utes!");
                break;
            case "blue":
                System.out.println("Boo BYU!");
                break;
            case "yellow":
                System.out.println("I don't believe you, nobody likes yellow");
                break;
            default:
                System.out.println("I like " + person1.favoriteColor + " too!");
                break;
        }

        System.out.println("To recap:");
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Favorite Color: " + person1.favoriteColor);
        System.out.println("Is that correct? y/n");

        String confirmation = myObj.nextLine().trim().toLowerCase();

        if(confirmation.equals("y"))
            System.out.println("Congratulations, you have created a person!");
        else if(confirmation.equals("n"))
            System.out.println("Dangit, lets try again!");
        else
            System.out.println("Entry error, try again!");





    }
}
