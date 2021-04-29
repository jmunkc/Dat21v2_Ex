package loops_strings;

public class PrintThreeTimes {

    public static void main(String[] args) {

        printThrice("Hello World");

    }

    public static void printThrice(String s) {

        for (int i = 0; i < 3; i++){
            System.out.println(s);
        }
    }
}
