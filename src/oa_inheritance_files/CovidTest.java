package oa_inheritance_files;

import java.time.LocalDateTime;

public class CovidTest {
    String testMethod;
    String testLocation;
    LocalDateTime testDateTime;
    boolean testResult;

    CovidTest(String testMethod, String testLocation, LocalDateTime testDateTime){
        this.testMethod = testMethod;
        this.testLocation = testLocation;
        this.testDateTime = testDateTime;

    }

    public void runTest(){
        System.out.println("Test is running...");
        this.testResult = false;
    }

    @Override
    public String toString(){
        return ("Location: " + testLocation + "\n" +
                "Time : " + testDateTime + "\n" +
                "Method: " + testMethod + "\n" +
                "Result: " + testResult);
    }

}
