package loops_strings;

import java.util.Random;

public class RandomNumOfHashtags {

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            randomNumHash();
        }
    }

    public static void randomNumHash(){
        Random random = new Random();
        int randomInt = random.nextInt(10) + 1;


        for(int i = 0; i < randomInt; i++){
            System.out.print('#');
        }
        System.out.println();
    }
}
