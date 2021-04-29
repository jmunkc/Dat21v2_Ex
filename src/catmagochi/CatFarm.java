package catmagochi;

import java.util.Random;
import java.util.Scanner;

/**
 * Takes name input from player and returns cat
 * object with 9 health and pseudo-random generated
 * attributes: mood, hunger, energy
 */

public class CatFarm {

    public Cat createCat(){

        // Instantiate Cat, Scanner, RandomGenerator
        Cat yourCat = new Cat(null);
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Prompt player to name cat
        System.out.println("What would you like to call your cat? ");
        yourCat.setName(in.nextLine());

        // Generate random values for cat attributes
        yourCat.setMood(rand.nextInt(9 ) + 1);
        yourCat.setHunger(rand.nextInt(9 ) + 1);
        yourCat.setEnergy(rand.nextInt(9 ) + 1);

        System.out.println();
        System.out.println("###################");
        System.out.println("# Here's your cat #");
        System.out.println("###################");
        yourCat.displayStats();
        yourCat.meow();

        return yourCat;
    }
}


