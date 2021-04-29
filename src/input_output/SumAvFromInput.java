import java.util.Scanner;

/**
 * Takes 5 different numbers as input and returns sum and average
 */

public class SumAvFromInput {

    public static void main(String[] args){

        // calls scanner to in
        Scanner in = new Scanner(System.in);


        /** promts user to input 5 numbers one at a time
         * and stores af var num1 - num5
         */

        System.out.println("Write a number (1/5): ");
        double num1 = in.nextDouble();

        System.out.println("Write another number (2/5): ");
        double num2 = in.nextDouble();

        System.out.println("Write another number (3/5): ");
        double num3 = in.nextDouble();

        System.out.println("Write another number (4/5): ");
        double num4 = in.nextDouble();

        System.out.println("Write the last number (5/5): ");
        double num5 = in.nextDouble();

        // calculate sum of num1 - num5
        double sum = (num1 + num2 + num3 + num4 + num5);

        // calculate average
        double av = (sum / 5);

        // output message with sum and average
        System.out.print("the sum of your numbers are ");
        System.out.println(sum + " and the average is " + av);



    }
}
