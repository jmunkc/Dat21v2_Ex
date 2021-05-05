package exceptions;

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
}
