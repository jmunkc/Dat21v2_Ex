package files_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    public static void printStudents(String fileName) throws FileNotFoundException {

        File studentsFile = new File("resources/"+fileName);

        System.out.println(studentsFile.exists());

        Scanner fileScanner = new Scanner(studentsFile);

        while (fileScanner.hasNext()) {

            String currentLine = fileScanner.nextLine();

            System.out.println(currentLine);
        }
    }

    public static ArrayList studentsArrayList(String fileName) throws FileNotFoundException {

        File studentsFile = new File("resources/"+fileName);

        Scanner fileScanner = new Scanner(studentsFile);

        ArrayList<Student> allStudents = new ArrayList<>();

        while (fileScanner.hasNext()) {

            String currentLine = fileScanner.nextLine();

            String[] studentsArray = currentLine.split(";");

            String name = studentsArray[1];
            String email = studentsArray[0];

            Student tempStudent = new Student(name, email);

            allStudents.add(tempStudent);
        }

        return allStudents;
    }
}
