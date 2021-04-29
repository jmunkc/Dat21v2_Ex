package exceptions;

import java.util.Scanner;

public class Login {
    static String cpr;
    static String password;

    public static void logCpr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your CPR number");
        cpr = (sc.nextLine());
    }

    public static void logPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your password");
        password = (sc.nextLine());
    }
}
