package exceptions;

public class NoSuchUserException extends RuntimeException {
    NoSuchUserException(){
        super("No Such User");
    }
}
