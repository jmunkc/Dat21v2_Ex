package oa_inheritance_files;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Test file reader with word count from words.csv
        FileReader fr = new FileReader();
        fr.fileWordCounter("words.csv");
        System.out.println();

        // Test covidTest inheritance example
        Pcr pcr = new Pcr();
        AntiGen antigen = new AntiGen();
        Antibody antibody = new Antibody();
        System.out.println();

        pcr.calcAnswerTime();
        pcr.runTest();
        System.out.println(pcr);
        System.out.println();

        antigen.calcAnswerTime();
        antigen.runTest();
        System.out.println(antigen);
        System.out.println();

        antibody.calcAnswerTime();
        antibody.runTest();
        System.out.println(antibody);

    }
}
