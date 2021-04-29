package files_exceptions;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //ReadFile.printStudents("students.csv");

        ArrayList<Student> allStudents = ReadFile.studentsArrayList("students.csv");

        StudentAnalytics analyze = new StudentAnalytics();

        System.out.println("Student with the longest name:");
        System.out.println(analyze.findLongestName(allStudents));

        System.out.println("Number of Simons:");
        System.out.println(analyze.howManySimons(allStudents));

        System.out.println("Average character length of names:");
        System.out.println(analyze.averageNameLength(allStudents));

        System.out.println("Highest amount of names");
        System.out.println(analyze.maxAmountOfNames(allStudents));

    }
}
