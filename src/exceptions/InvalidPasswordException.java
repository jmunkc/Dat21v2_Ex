package exceptions;

public class InvalidPasswordException extends Exception{

    int exceptionType = 0;

    public InvalidPasswordException(int type){
        super("Invalid password: ");

        exceptionType = type;

    }

    public String message() {
        switch(exceptionType){

            case 1:
                return("Password should be between 6 snd 40 characters");

            case 2:
                return("Password should contain both numbers and letters");

            case 3:
                return("Pasword should not contain: æ, ø or å");

            case 4:
                return("Password should not contain the same character four time in a row");

            case 5:
                return("Password should not begin or end with blank space");

            case 6:
                return("Password should not contain part of your CPR- or NemID-number");

            case 7:
                return("Password can only contain following special characters: \n" +
                        "! ? \" @ # $ % & , . : ; ' * _ ^ + - = ( ) { }");

            case 8:
                return("Password should only be numbers if only four characters long");

            case 9:
                return("Password should not be a numeric series");


        }
        return ("");
    }
}
