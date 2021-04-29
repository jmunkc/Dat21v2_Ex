package files_exceptions;

import java.util.ArrayList;

public class StudentAnalytics {


    public String findLongestName(ArrayList<Student> allStudents){
        int longestName = 0;
        String studentWithLongestName = allStudents.get(0).getName();

        for (int i = 0; i < allStudents.size(); i++){

            if(allStudents.get(i).getName().length() > longestName){

                longestName = allStudents.get(i).getName().length();

                studentWithLongestName = allStudents.get(i).getName();
            }
        }

        return studentWithLongestName;
    }

    public int howManySimons(ArrayList<Student> allStudents){
        int numberOfSimons = 0;

        for(int i = 0; i < allStudents.size(); i++){

            if(allStudents.get(i).getName().startsWith("Simon")){
                numberOfSimons++;
            }
        }
        return numberOfSimons;
    }


    public int averageNameLength(ArrayList<Student> allStudents){
        int numberOfNames = 0;
        int sumOfNamesLength = 0;

        for (int i = 0; i < allStudents.size(); i++){
            sumOfNamesLength = sumOfNamesLength + allStudents.get(i).getName().trim().length();
            numberOfNames++;
        }

        int averageNameLength = sumOfNamesLength / numberOfNames;

        return  averageNameLength;
    }


    public String maxAmountOfNames(ArrayList<Student> allStudents){

        String studentWithMostNames = allStudents.get(0).getName();

        int spaceCount = 0;
        int tempCount = 0;

        for(int i = 0; i < allStudents.size(); i++){
            tempCount = 0;

            for (int j = 0; j < allStudents.get(i).getName().length(); j++){

                char ch = allStudents.get(i).getName().charAt(j);

                if (ch == ' '){
                    tempCount++;
                }
            }
            if(tempCount > spaceCount){
                studentWithMostNames = allStudents.get(i).getName();
                spaceCount = tempCount;
            }
        }

        spaceCount++;

        return studentWithMostNames + " = " + spaceCount;
    }
}

