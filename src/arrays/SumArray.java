package arrays;

import java.util.Arrays;

public class SumArray {

    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,1,1,1,1};

        System.out.println(sumNumbersFromArray(numbers));
        System.out.println(findSumWithoutUsingStream(numbers));
        System.out.println(findSumWithoutUsingStream(numbers));

    }

    public static int sumNumbersFromArray( int[] numbers){

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];

        }
        return sum;
    }

    public static int findSumWithoutUsingStream(int[] numbers) {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        return sum;
    }

    public static int findSumUsingStream(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
