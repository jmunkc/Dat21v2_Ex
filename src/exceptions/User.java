package exceptions;

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
}
