package catmagochi;

import java.util.ArrayList;

/**
 *
 */


public class Game {

    public void runGame(){

        // Instantiate Menu class
        // * Has methods presentMainMenu(), presentGameMenu() & fetchInput()
        Menu gameMenu = new Menu();

        while (true) {

            // Present main menu
            gameMenu.presentMainMenu();

            // Player input
            int i = gameMenu.fetchInput();

            // If choice out of bounds return to beginning of while loop
            if(i < 1 || i > 2){
                System.out.println("Please pick 1 or 2. Try again");
                continue;
            }

            // Game quit choice
            else if(i == 2){
                System.out.println("Goodbye!");
                break;
            }

            // Begin cat creation
            else{

                // Boolean flag for running while loop
                boolean quitGame = false;

                // Instantiate CatFarm object in yourCatFarm
                // * Can create Cat object with createCat()
                CatFarm yourCatFarm = new CatFarm();

                // Instantiate Cat object in yourCat
                // * Has methods: Meow(), Puke(), Sleep(), Feed(), LeaveAlone(), DisplayStats(), Confuse()
                // * Has getters & setters for: name, health, mood, hunger, energy
                Cat yourCat = yourCatFarm.createCat();

                // Instantiate ArrayList class in yourCats object
                // * Has method add(), get() & set()
                ArrayList<Cat> yourCats = new ArrayList<>();

                // Add created cat to ArrayList
                yourCats.add(yourCat);

                // PLay game
                while (quitGame == false) {

                    // Instantiate chosenCat object
                    Cat chosenCat;

                    // If more than one cat exists in ArrayList prompt player to
                    // choose which cat to interact with
                    if( yourCats.size() > 1) {
                        System.out.println("Which cat would you like to interact with?");

                        // Print out cats in ArrayList by index number + 1
                        for (int k = 0; k < yourCats.size(); k++) {
                            System.out.print((k + 1) + ". " + yourCats.get(k).getName() + " ");
                        }

                        // Prompt player input choice
                        System.out.println();
                        System.out.print("[Type number and pres enter]: ");
                        System.out.println();

                        // Save player choice as integer l - 1
                        int l = gameMenu.fetchInput() - 1;

                        // If choice out of bounds return to beginning of while loop
                        if (l >= yourCats.size()) {
                            System.out.println("Please type one of the designated numbers. Try again");
                            continue;
                        }

                        // Save player choice index from arraylist in chosenCat object
                        chosenCat = yourCats.get(l);

                        // run leaveAlone for all cat objects in arraylist
                        // except player choice index l.
                        for (int k = 0; k < yourCats.size(); k++) {
                            if(k != l){
                                yourCats.get(k).leaveAlone();
                            }
                        }
                    }

                    // if only one cat object in arraylist - save
                    // object in chosenCat
                    else {
                        chosenCat = yourCats.get(0);
                    }

                    // Prompt menu with player choices
                    gameMenu.presentGameMenu();

                    // Declare feed counter. Stacks to 3 if feed() is called three
                    // times in a row then reset.
                    // Is subsequently reset if player choose any other method than feed()
                    int count = 0;

                    // Player input choice as integer j
                    int j = gameMenu.fetchInput();

                    // If choice out of bounds start over
                    if (j < 1 || j > gameMenu.gameMenuItems.length) {
                       System.out.println("Please type one of the designated numbers. Try again");
                     continue;
                    }

                    // Player input j used as choice of case in switch
                    else{
                        switch (j) {

                        // Player input calling the feed method from the cat class and increments count variable by 1
                        // if count reaches 3 the puke method from the cat class i called and count is set back to 0
                        case 1:
                            chosenCat.feed();
                            count++;
                            if (count == 3) {
                                chosenCat.puke();
                                count = 0;
                            }
                            //chosenCat.displayStats();
                            break;

                        // player input calling the play method from the cat class
                        case 2:
                            count = 0;
                            chosenCat.play();
                            //chosenCat.displayStats();
                            break;


                        // player input calling the sleep method from the cat class
                        case 3:
                            count = 0;
                            chosenCat.sleep();
                            //chosenCat.displayStats();
                            break;

                        // Player input calling the confuse method from the cat class
                        case 4:
                            count = 0;
                            chosenCat.confuse();
                            //chosenCat.displayStats();
                            break;

                        // Player input from scanner printing the cat stats to the terminal
                        case 5:
                            count = 0;
                            chosenCat.displayStats();
                            break;

                        // Player input from scanner creating a new cat object by calling the createCat method
                        // from the CatFarm class
                        case 6:
                            count = 0;
                            Cat anotherCat = yourCatFarm.createCat();
                            yourCats.add(anotherCat);
                            break;

                        //  Player inputs from scanner choice case 7 sets boolean flag to true and player quits the game
                        case 7:
                            System.out.println("Thank you for playing");
                            quitGame = true;

                        }
                    }

                    // Instantiate CriteriaCheck object in check. Can use method: checkWinLose()
                    CriteriaCheck check = new CriteriaCheck();

                    // Check for win or loose. If true - quit
                    for (int k = 0 ; k < yourCats.size() ; k++){
                    quitGame = check.checkWinLose(yourCats.get(k).getMood(), yourCats.get(k).getHunger(),
                            yourCats.get(k).getHealth(), yourCats.get(k).getName());
                    }
                }
            }
        }
    }
}

