package exceptions;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        NemIdAuthorizer aut = new NemIdAuthorizer();
        User user = new User(null, null);

        user.logCpr();
        user.logPassword();

        System.out.println(aut.isValidInput(user.getCpr(), user.getPassword()));

        System.out.println(aut.isUser(user.getCpr(), user.getPassword()));
    }
}
