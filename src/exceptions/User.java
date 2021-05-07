package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User {

    private String cpr, password;

    public User(String cpr, String password){
        this.cpr = cpr;
        this.password = password;

    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpr(){
        return cpr;
    }

    public String getPassword() {
        return password;
    }

    public void logCpr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your CPR number");
        setCpr(sc.nextLine());
    }

    public void logPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type your password");
        setPassword(sc.nextLine());
    }

    public void createUser() throws FileNotFoundException {
        File usersFile = new File("resources/users.csv");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(usersFile);
        NemIdAuthorizer aut = new NemIdAuthorizer();

        pw.print("");

        System.out.println(("To create a new user:"));

        boolean valid = false;

        while(!valid) {

            System.out.println("Type your CPR number");
            String cpr = sc.nextLine();

            System.out.println("Type your new password");
            String password = sc.nextLine();

            aut.isValidInput(cpr, password);

            try {
                valid = aut.isValidPassword(cpr, password);

            } catch (InvalidPasswordException e) {
                System.out.println("Password not valid - try again");
            }
        }

        pw.print(cpr + ";");
        pw.println(password + ";");

        pw.close();

    }
}
