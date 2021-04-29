package arrays;

public class OverNumber {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,5,5};

        System.out.println(elementsOverInt(numbers, 5));

    }

    public static int elementsOverInt( int[] numbers, int number){

        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > number) {
                count++;
            }
        }
        return count;
    }

}
