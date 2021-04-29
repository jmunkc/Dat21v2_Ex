package cat_person_game;

// Cat class takes parameters nameOfCat (String), moodOfCat(int), hungerOfCat(int) and energyOfCat(int)
public class Cat {

    // Attributes of cat
    private String name;
    private int mood, hungry, energy;

    //Constructor
    public Cat(String nameOfCat, int moodOfCat, int hungerOfCat, int energyOfCat){
        this.name = nameOfCat;
        this.mood = moodOfCat;
        this.hungry = hungerOfCat;
        this.energy = energyOfCat;
    }
    // Various greetings from parameters
    public void greet(){

        System.out.println("Hello yes, this is cat");
        System.out.println("My name is " + name);

        // Mood
        if (mood < 4){
            System.out.println("I fucking hate mondays!!!");
        }
        else if (mood > 4 && mood < 6){
            System.out.println("I'm like, whatever...");
        }
        else{
            System.out.println("[Purring noises]");
        }

        // Hunger
        if (hungry > 7){
            System.out.println("Giv' me LASAGNA!!!");
        }
        else if (hungry > 4 && hungry < 7){
            System.out.println("Do you have a snack for me?");
        }
        else{
            System.out.println("Barff, no more food!");
        }

        // Energy
        if (energy < 4){
            System.out.println("I'm not moving an inch.");
        }
        else if (energy > 4 && energy < 6){
            System.out.println("Do you wanna play cat and mouse?");
        }
        else{
            System.out.println("LET'S PLAY! ARRGHHHHH!!!");
        }

        System.out.println();
    }
}
