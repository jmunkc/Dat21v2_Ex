// imports java utillity library package
import java.util.Scanner;

/**
 * Lets the user input string and echoes
 */

// names class
public class Echo {

    //calls main method
    public static void main(String[] args){

         // calls the Scanner class
        Scanner in = new Scanner(System.in);

        //promt the user to input string
        System.out.println("Write your text here: ");
        String echo = in.nextLine();

        //return messeage concatenated with input string
        System.out.println("You wrote: " + echo);


                
                
    }
    
}
