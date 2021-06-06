package oa_inheritance_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public void fileWordCounter(String fileName) throws FileNotFoundException {
        int count = 0;
        File file = new File("resources/" + fileName);
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNext()){

            fileScanner.next();
            count++;
        }

        System.out.println("Number of words in file: " + count);
    }
}
