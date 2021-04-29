package array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises {


    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("yes");
        stringList.add("this");
        stringList.add("is");
        stringList.add("dog");

        // Print out list
        System.out.println(stringList);

        // Print out list strings
        for (int i = 0 ; i < stringList.size(); i++){

            System.out.print(stringList.get(i) + " ");
        }

        // Print list string back to front
        System.out.println();
        for (int j = stringList.size() -1 ; j >= 0 ; j--) {

            System.out.print(stringList.get(j) + " ");
        }

        System.out.println();

        //Print stringList from n to k integer
        ArrayListExercises.printFromNToK(1,4, stringList);

        System.out.println();

        // Method that accepts string input and returns in list
        ArrayList list = ArrayListExercises.addStringToList();
        System.out.println(list);

        // Method swaps string at index n with string at index k
        ArrayListExercises.swapIndex(0,4, stringList);

        // Method takes string input and returns arraylist with characters of input
        ArrayList charList = ArrayListExercises.stringToCharList();
        System.out.println(charList);
    }

    public static void printFromNToK(int n, int k, ArrayList<String> addList){

        for (int i = n ; i <= k ; i++){
            System.out.print(addList.get(i));
        }
    }


    public static ArrayList<String> addStringToList(){

        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Type in your string");

            String word = in.nextLine();
            list.add(word);
            String exit = "no strings attached";

            if(list.contains(exit)){
                break;
            }
        }
        return list;
    }

    public static ArrayList<String> swapIndex(int n, int k, ArrayList<String> listToSwap){

        System.out.println(listToSwap);

        String swap1 = listToSwap.get(n);
        String swap2 = listToSwap.get(k);
        listToSwap.set(n, swap2);
        listToSwap.set(k, swap1);

        System.out.println(listToSwap);

        return listToSwap;
    }

    public static ArrayList<Character> stringToCharList(){

        ArrayList<Character> charList = new ArrayList<Character>();
        Scanner in = new Scanner(System.in);

        System.out.println("Type in a word");
        String word = in.nextLine();

        for(int i = 0 ; i < word.length() ; i++){
            charList.add(word.charAt(i));
        }

        return charList;
    }
}
