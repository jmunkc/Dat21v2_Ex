package arrays;

public class PrintNthString {

    public static void main(String[] args) {

        String[] strings = {"Hello ", "world", ", ", "how ", "are ", "you", "?"};
        stringIndexPrint(strings, 1);
    }


    public static void stringIndexPrint(String[] str, int n){

        if (n > str.length){
            System.out.println("Index [n] out of bounds of array.");
        }
        else {
            System.out.println(str[n]);
        }

    }

}
