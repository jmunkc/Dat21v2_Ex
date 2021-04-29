package interfaces_polymorphisme;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Guitar g = new Guitar();
        Trumpet t = new Trumpet();
        Drums d = new Drums();

        ArrayList<Playable> listOfSounds = new ArrayList<Playable>();

        listOfSounds.add(g);
        listOfSounds.add(t);
        listOfSounds.add(d);

        for(int i = 0 ; i < listOfSounds.size() ; i++){
            System.out.println(listOfSounds.get(i).playSound());
        }
    }
}
