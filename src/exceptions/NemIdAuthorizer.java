package exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NemIdAuthorizer {

    public boolean isValidInput(String cpr, String password){

        Scanner inputScan = new Scanner(System.in);

        boolean correctLength = false;

        while(!correctLength) {
            System.out.println(cpr);

            try {
                if (cpr.length() != 10) {
                    throw new InputMismatchException();

                } else {
                    correctLength = true;
                }


            } catch (InputMismatchException e) {
                System.out.println("Wrong input length for CPR - Try again");
                cpr = inputScan.nextLine();

            }
        }
        return true;
    }

    public boolean isUser(String cpr, String password) throws FileNotFoundException {
        InitializeUsers init = new InitializeUsers();
        ArrayList<User> users = init.loadUsers();

        Scanner inputScan = new Scanner(System.in);
        boolean found = false;

        while (!found) {

            try{
                for (User user : users) {
                    if (cpr.equals(user.getCpr())) {

                        if (password.equals(user.getPassword())) {
                            found = true;
                        } else {
                            throw new WrongPasswordException();

                        }
                    }
                }
                if(!found){
                    throw new NoSuchUserException();
                }
            }

            catch(NoSuchUserException e){
                System.out.println("CPR does not match any user - try again");
                cpr = inputScan.nextLine();
            }
            catch(WrongPasswordException e){
                System.out.println("Password does not match user cpr - try again");
                password = inputScan.nextLine();
            }
        }

        return true;
    }

    public boolean isValidPassword(String cpr, String password) throws InvalidPasswordException {
        // wrap in try - catch ?

        boolean valid = false;

        String passwordCheck = password.toLowerCase();

        if(!(passwordCheck.length() == 4)){
            if(passwordCheck.length() > 6 && passwordCheck.length() < 40){
                throw new InvalidPasswordException(1);
            }
        }

        else if(!(passwordCheck.matches("^(?=.*[a-z])(?=.*[0-9])[a-z0-9]+$"))){
            throw new InvalidPasswordException(2);
        }

        else if(passwordCheck.contains("æ") || passwordCheck.contains("ø") || passwordCheck.contains("å")){
            throw new InvalidPasswordException(3);
        }

        else if(true){

            for(int i = 0; i < (passwordCheck.length() - 4); i++){
                if(passwordCheck.charAt(i) == (passwordCheck.charAt(i+1))
                    && passwordCheck.charAt(i+1) == (passwordCheck.charAt(i+2))
                    && passwordCheck.charAt(i+2) == (passwordCheck.charAt(i+3))){
                    throw new InvalidPasswordException(4);
                }
            }
        }

        else if(passwordCheck.matches(" (.*)") || passwordCheck.matches("(.*) ")){
            throw new InvalidPasswordException(5);
        }

        else if(passwordCheck.contains(cpr.substring(0,3)) || passwordCheck.contains(cpr.substring(1,4))
                || passwordCheck.contains(cpr.substring(2,5)) || passwordCheck.contains(cpr.substring(3,6))
                || passwordCheck.contains(cpr.substring(4,7)) || passwordCheck.contains(cpr.substring(5,8))
                || passwordCheck.contains(cpr.substring(6,9))){
            throw new InvalidPasswordException(6);
        }

        else if (true) {
            for (int i = 126; i < 256; i++) {
                if (passwordCheck.indexOf((char)i) > 0) {
                    throw new InvalidPasswordException(7);
                }
            }
            if(passwordCheck.indexOf((char)60) > 0 || passwordCheck.indexOf((char)62) > 0
                || passwordCheck.indexOf((char)91) > 0 || passwordCheck.indexOf((char)93) > 0
                || passwordCheck.indexOf((char)124) > 0 ) {
                throw new InvalidPasswordException(7);
            }
        }

        else if(passwordCheck.length() == 4){
            try{
                Integer.parseInt(passwordCheck);
            }
            catch(NumberFormatException e){
                throw new InvalidPasswordException(8);
            }
        }

        else if(passwordCheck.charAt(0) == (passwordCheck.charAt(1) - 1)
                && passwordCheck.charAt(1) == (passwordCheck.charAt(2) - 1)
                && passwordCheck.charAt(2) == (passwordCheck.charAt(3) - 1)){
            throw new InvalidPasswordException(9);
        }

        else{
            valid = true;
        }

        return valid;

    }
}
