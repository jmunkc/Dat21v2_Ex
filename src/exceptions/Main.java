package exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        NemIdAuthorizer aut = new NemIdAuthorizer();

        System.out.println(aut.isValidInput("012345678", "qwerty"));
        System.out.println(aut.isUser("012345678", "qwerty"));
    }
}
