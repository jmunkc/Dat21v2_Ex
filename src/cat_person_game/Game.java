package cat_person_game;

public class Game {

    public static void main(String args[]){

        Cat cat1 = new Cat("Garfield", 1, 10, 0);
        cat1.greet();

        Cat cat2 = new Cat("Sweetie", 10, 5, 5);
        cat2.greet();

        Person per1 = new Person("Grumpy George", false, 1,1);
        per1.greet();

        Person per2 = new Person("Loving Lone", true, 10,10);
        per2.greet();
    }
}
