package input_output;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args){

        // define variables
        double height, weight;
        String name;
        Scanner in = new Scanner(System.in);

        // promt user to input name, heigth in meters and weight in kg
        System.out.println("Hello, please type your name: ");
        name = in.nextLine();

        System.out.println("Thank you, now please type your height in meters: ");
        height = in.nextDouble();

        System.out.println("Thank you, now please type your weight in kg: ");
        weight = in.nextDouble();

        // calculate BMI
        double BMI = (weight / (height * height));

        // output message with calculated BMI
        System.out.printf("Thank you %s, your BMI is %.1f\n", name, BMI);
        System.out.println("Have a nice day :)");
    }
}
