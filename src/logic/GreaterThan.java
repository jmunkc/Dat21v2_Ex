package logic;

import java.util.Scanner;

public class GreaterThan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Please type a number");
        num1 = in.nextDouble();

        System.out.println("Please type another number");
        num2 = in.nextDouble();

        System.out.println("Please type another number");
        num3 = in.nextDouble();

        if ( num1 > num2 && num1 > num3){
            System.out.println(num1 + " is largest!");
        }

        else if ( num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is largest!");
        }

        else if (num3 > num2 && num3 > num1){
            System.out.println(num3 + " is largest!");
        }

        else if (num1 == num2){
            System.out.println("The numbers are all equal. Try again.");
        }
    }


}
