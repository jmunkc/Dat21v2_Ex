package oa_methods_loops;

public class SumInteger {

    public static void main(String[] args){

        System.out.println(sumUntilN(4));
    }

    public static int sumUntilN(int n){

        int sum = 0;

        for (int i = 0; i < n; i++){
            sum = sum + i;

        }
        return sum;

    }
}
