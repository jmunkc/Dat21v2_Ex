package oa_oop_arraylist;

import java.util.Scanner;

public class HeadbookMenu {

    // Instantiate Scanner class
    private Scanner in = new Scanner(System.in);

    // Attributes are arrays of strings describing menu items
    String[] logInMenuItems = {
            " 1. Create user profile",
            " 2. Quit"
    };

    String[] HeadbookMenuItems = {
            " 1. Search for friends",
            " 2. Add friend",
            " 3. Display all friends",
            " 4. Log out"
    };

    // prints each index in array
    public void presentLogInMenu(){
        System.out.println("### Welcome to Headbook ###");
        for(int i = 0; i < logInMenuItems.length; i++){
            System.out.println(logInMenuItems[i]);
        }
        System.out.println("###########################");
        System.out.print("[Type number & pres enter]: ");
    }

    // prints each index in array
    public void presentHeadbookMenu(){
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("################################");
        for(int i = 0; i < HeadbookMenuItems.length; i++){
            System.out.println(HeadbookMenuItems[i]);
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
