package inheritance_abstract;

import java.util.ArrayList;

public class PettingZoo {

    public static void main(String[] args) {

        Cod c = new Cod("John", 0, false);
        Kangaroo k = new Kangaroo("Jack", 2, true);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(c);
        animalList.add(k);

        for(int i = 0; i < animalList.size(); i++){
            animalList.get(i).makeSound();
        }
    }
}
