package arrays;


public class HighestValueArray {

    public static void main(String[] args){

        int[] ints = {1,4,54,5,8,45,687,4,5,1000};

        System.out.println(maxValueArray(ints));

    }

    public static int maxValueArray(int[] integers){

        int maxValue = integers[0];

        for (int i = 1; i <= integers.length; i++){

            if (integers[i] > maxValue){
                maxValue = integers[i];
            }
        }

        return maxValue;
    }
}
