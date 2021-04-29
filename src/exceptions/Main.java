package exceptions;

public class Main {
    public static void main(String[] args) {

        NemIdAuthorizer aut = new NemIdAuthorizer();

        Login.logCpr();
        Login.logPassword();

        aut.isValidInput(Login.cpr, Login.password);
    }
}
