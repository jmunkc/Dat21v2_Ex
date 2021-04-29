import java.util.Scanner;

public class HalfInputInt {

    /**
     *Lets user input a number and returns half its value
     */

    public static void main(String[] args){

        // calls scanner class
        Scanner in = new Scanner(System.in);

        // promts user to input a number
        System.out.println("Write a number here to get half it's value: ");

        // takes users number input and stores as float
        double number = in.nextDouble();

        // divides input float with 2
        number = number / 2;

        // prints message with concatenated return number
        System.out.println("Half your number is: " + number);

    }
}
