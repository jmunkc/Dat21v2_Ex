package cat_person_game;

// Person class takes parameters nameOfPerson (String), likeCats(boolean), foodGenerosity(int)
// and susceptibleToCuteness (int)

public class Person {

    // Attributes of person
    private String name;
    private boolean mood;
    private int food, cuteness;

    //Constructor
    public Person(String nameOfPerson, boolean likeCats, int foodGenerosity, int susceptibleToCuteness){
        this.name = nameOfPerson;
        this.mood = likeCats;
        this.food = foodGenerosity;
        this.cuteness = susceptibleToCuteness;
    }
    // Various greetings from parameters
    public void greet(){

        System.out.println("Hello, my name is " + name);

        // Mood
        if (mood == true){
            System.out.println("I love cats!");
        }
        else{
            System.out.println("I'm more of a dog person...");
        }

        // Food
        if (food < 2){
            System.out.println("STARVE! MUHAHAHAHAHA!");
        }
        else if (food > 2 && food < 7){
            System.out.println("Here, have a snack");
        }
        else{
            System.out.println("Do you want lasagna?");
        }

        // Cuteness
        if (cuteness < 4){
            System.out.println("Your charms are lost on me.");
        }
        else if (cuteness > 4 && cuteness < 6){
            System.out.println("Sure i'll play with you, For a while....");
        }
        else{
            System.out.println("SOOO CUTE! ARRGHHHHH!!!");
        }

        System.out.println();
    }
}
