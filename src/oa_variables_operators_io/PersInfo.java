package oa_variables_operators_io;

import java.util.Scanner;

public class PersInfo {

    public static void main(String[] args){

        // Define variables
        String name, occupation, age, height;

        Scanner in = new Scanner(System.in);

        // Promt user to input name, age, height, occupation
        System.out.println("Hello, please type yor name here:");
        name = in.nextLine();

        System.out.print("Thank you " + name + ". ");
        System.out.println("Please type your age:");
        age = in.nextLine();

        System.out.print("Thank you. ");
        System.out.println("Please type your height:");
        height = in.nextLine();

        System.out.print("Thank you. ");
        System.out.println("Please type your occupation:");
        occupation = in.nextLine();

        // Display message with user information
        System.out.println("Thank you. Your information is:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Occupation: " + occupation);
    }
}
