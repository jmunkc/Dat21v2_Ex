import java.util.Scanner;
import static java.lang.Math.abs;

public class DiffN21 {
    // Prompts user interger and returns differens between int and 21
    public static void main(String[] args){

        // call scanner class
        Scanner in = new Scanner(System.in);

        // promt user to input integer
        System.out.println("Write an integer here: ");

        // takes user input and stores as int
        int n = in.nextInt();

        // calculate differens between int and 21 in absolute value
        n = abs(n - 21);

        // output answer
        System.out.println("The differens are: " + n);


    }
}
