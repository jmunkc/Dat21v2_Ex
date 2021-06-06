package oa_oop_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveMultipleFromList {

    public static void listProgram() {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i, i + 1);
        }

        System.out.println(list);

        System.out.println("Type a number to remove all multiples of it in the list.");

        int number = in.nextInt();

        Iterator<Integer> listIterator = list.iterator();

        while (listIterator.hasNext()) {
            Integer currentInt = listIterator.next();

            if (currentInt != number && currentInt % number == 0) {
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}
