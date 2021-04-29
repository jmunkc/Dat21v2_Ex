package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NemIdAuthorizer {


    public boolean isValidInput(String cpr, String password){
        //Scanner sc = new Scanner(System.in);

        boolean validated = false;

        while(validated == false) {

            try {
                if (Login.cpr.length() != 10) {
                    throw new InputMismatchException();

                } else {
                    validated = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong CPR - Try again");
                Login.logCpr();

            }
        }
        return true;
    }
}
