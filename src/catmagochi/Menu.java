package catmagochi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Can prompt menus with methods presentMainMenu()
 * and presentGameMenu(), and takes integer input
 * from player with fetchInput()
 */

public class Menu {

    // Instantiate Scanner class
    private Scanner in = new Scanner(System.in);

    // Attributes are arrays of strings describing menu items
    String[] mainMenuItems = {
            " 1. Create a cat",
            " 2. Quit Game"
    };

    String[] gameMenuItems = {
            " 1. Feed cat",
            " 2. Play with cat",
            " 3. Put cat to sleep",
            " 4. Confuse your cat",
            " 5. Check on your cat",
            " 6. Create another cat",
            " 7. Exit to main"
    };

    // prints each index in array
    public void presentMainMenu(){
        System.out.println("### Main Menu ###");
        for(int i = 0; i < mainMenuItems.length; i++){
            System.out.println(mainMenuItems[i]);
        }
        System.out.println("#################");
        System.out.print("[Type number & pres enter]: ");
    }

    // prints each index in array
    public void presentGameMenu(){
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("################################");
        for(int i = 0; i < gameMenuItems.length; i++){
            System.out.println(gameMenuItems[i]);
        }
        System.out.println("################################");
        System.out.print("[Type number & pres enter]: ");
    }

    // Uses Scanner to take integer input and returns in attribute choice
    public int fetchInput(){
        int choice = in.nextInt();
        return choice;
    }

}
