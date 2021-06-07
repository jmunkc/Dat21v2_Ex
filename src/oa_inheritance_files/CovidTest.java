package oa_inheritance_files;

import java.time.LocalDateTime;


// Super class
public class CovidTest {

    // Field of super class
    private String testMethod;
    private String testLocation;
    private LocalDateTime testDateTime;
    private LocalDateTime answerTime;
    private boolean testResult;

    // Super class constructor
    CovidTest(String testMethod, String testLocation, LocalDateTime testDateTime){
        this.testMethod = testMethod;
        this.testLocation = testLocation;
        this.testDateTime = testDateTime;
    }

    // Getters and setters for super class constructor
    public String getTestMethod(){
        return this.testMethod;
    }

    public String getTestLocation(){
        return this.testLocation;
    }

    public LocalDateTime getTestDateTime(){
        return this.testDateTime;
    }

    public boolean isTestResult() {
        return testResult;
    }

    public LocalDateTime getAnswerTime() {
        return answerTime;
    }

    public void setTestMethod(String testMethod){
        this.testMethod = testMethod;
    }

    public void setTestLocation(String testLocation) {
        this.testLocation = testLocation;
    }

    public void setTestDateTime(LocalDateTime testDateTime){
        this.testDateTime = testDateTime;
    }

    public void setTestResult(boolean testResult){
        this.testResult = testResult;
    }

    public void setAnswerTime(LocalDateTime answerTime) {
        this.answerTime = answerTime;
    }

    // Behavior of super class
    public void runTest(){
        System.out.println("Test is running...");
        this.testResult = false;
    }

    public void calcAnswerTime(){}

    // Overridden behavior of superclass extended from "Object" class
    @Override
    public String toString(){
        return ("Location: " + testLocation + "\n" +
                "Time: " + testDateTime + "\n" +
                "Answer time: " + answerTime + "\n" +
                "Method: " + testMethod + "\n" +
                "Result: " + testResult);
    }

}
