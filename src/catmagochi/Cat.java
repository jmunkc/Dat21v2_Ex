package catmagochi;

/**
 * Makes non-static instance of Cat object
 * with private attributes: name, mood, hunger, energy and health
 *
 * Cat class takes parameters nameOfCat (String)
 * Has methods Meow(), Puke(), Feed(), Sleep(), Play(), LeaveAlone(), DisplayStats(), Confuse()
 * Has setters and getters for all attributes
 */

public class Cat {

    // Attributes of cat
    private  String name;
    private  int mood, hunger, energy, health = 9;

    //Constructor
    public Cat(String nameOfCat){
        this.name = nameOfCat;
    }

    // Methods used by cat

    // Prints message from cat
    public void meow(){

        System.out.println();
        System.out.println("[" + name + " says]: Meeoow");
    }

    // Adds 1 to hunger and subtracts 2 from energy
    // if levels allow it. Health and energy lower bound 0.
    // If energy lower bound is exceeded, 1 or 2 is subtracted from
    // health equal to the exceeded amount.
    public void puke(){

        if(energy == 0){
            this.health = health - 2;
            System.out.println();
            System.out.print("[Your cat lost two lives] ");
        }
        else if(energy == 1){
            this.health --;
            System.out.println();
            System.out.print("[Your cat lost a life.] ");
        }

        this.hunger ++;

        if(energy >= 2){
            this.energy = energy - 2;
        }
        else if(energy == 1){
            this.energy --;
        }
        System.out.println();
        System.out.println("You fed it to much!");
        System.out.println("It puked and lost a lot of energy");
    }

    // Methods used by player

    // Adds 1 to energy and hunger if levels allow.
    // upper bound 10
    // If hunger upper bound is exceeded, 1 is subtracted from health
    public void sleep(){
        if (energy < 10) {
            this.energy++;
        }

        else{
            System.out.println();
            System.out.println("[Energy is at maximum] " + name + " can't sleep.");
        }

        if (hunger < 10){
            this.hunger ++;
        }
        else{
            System.out.println();
            System.out.println("[Hunger is at maximum] " + name + " demands food!");
            this.health --;
            System.out.println("[Your cat has lost a life from starvation!]");
        }
    }

    // Subtracts 1 from hunger and adds 1 to mood if levels allow
    // Hunger lower bound 0, mood upper bound 10
    // Calls on Meow()
    public void feed(){
        if(hunger > 0){
            this.hunger --;
        }
        else{
            System.out.println();
            System.out.println("[Hunger is at minimum] " + name + " won't eat."); }

        if(mood < 10){
            this.mood ++;
        }
        else{
            System.out.println();
            System.out.println("[Mood is at maximum]");
        }
        meow();
    }

    // Adds 1 to mood and subtracts 1 from energy if levels allow
    // Mood upper bound 10, energy lower bound 0. If energy lower bound
    // is exceeded 1 is subtracted from health
    // Calls on Meow()
    public void play(){
        if(mood < 10){
            this.mood ++;
        }
        else{
            System.out.println();
            System.out.println("[Mood is at maximum]");
        }
        if(energy > 0){
            this.energy --;
        }
        else{
            System.out.println();
            System.out.println("[Energy is at minimum] " + name + " needs to sleep!");
            this.health --;
            System.out.println("[Your cat has lost a life from sleep deprivation]");
        }
        meow();
    }

    // Subtracts 1 from mood, adds 1 to hunger and energy.
    // Mood lower bound 0, hunger and energy upper bound 10
    // if bounds are exceeded 1 is subtracted from health
    public void leaveAlone(){
        if(mood > 0){
            this.mood --;
        }
        else{
            System.out.println();
            System.out.println("[Mood is at minimum] " + name + " demands attention!");
            this.health --;
            System.out.println("[Your cat has lost a life from loneliness]");

        }
        if(hunger < 10){
            this.hunger ++;
        }
        else{
            System.out.println();
            System.out.println("[Hunger is at maximum] " + name + " demands food!");
            this.health --;
            System.out.println("[Your cat has lost a life from starvation]");
        }
        if(energy < 10){
            this.energy ++;
        }
        else{
            System.out.println();
            System.out.println("[Energy is at maximum] " + name + " demands to play!");
            this.health --;
            System.out.println("[Your cat has lost a life from going BANANAZ!]");
        }

    }

    // Prints attributes of cat
    public void displayStats(){

        System.out.println("# Name: " + name);
        System.out.println("# Health: " + health);
        System.out.println("# Mood:   " + mood);
        System.out.println("# Hunger: " + hunger);
        System.out.println("# Energy: " + energy);
        System.out.println("############");
    }

    // Adds 1 to health, upper bound 9
    public void confuse(){
        if(health < 9){
            this.health ++;
            System.out.println();
            System.out.println(name + " is thoroughly confused!!!");
        }
        else{
            System.out.println();
            System.out.println("[Health is at maximum]");
        }
    }


    // Getters
    public int getMood() {
        return mood;
    }

    public String getName() {
        return this.name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int  getHealth() { return health; }

    // Setters
    public void setMood(int mood) {
        this.mood = mood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
