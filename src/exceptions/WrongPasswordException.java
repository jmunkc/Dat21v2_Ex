package exceptions;

public class WrongPasswordException extends RuntimeException {
    WrongPasswordException(){
        super("Password does not match user");
    }
}
