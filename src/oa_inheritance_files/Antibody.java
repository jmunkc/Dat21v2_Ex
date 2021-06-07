package oa_inheritance_files;

import java.time.LocalDateTime;

// Sub class of CovidTest
public class Antibody extends CovidTest{

    // Extension of CovidTest constructor
    public Antibody(){super("Blood sample", "Private Clinic", LocalDateTime.now());}


    // Overridden method from CovidTest
    public void runTest(){
        System.out.println("Test is running...");
        super.setTestResult(true);
    }

    // Overridden method from CovidTest
    public void calcAnswerTime(){
        super.setAnswerTime((super.getTestDateTime().plusHours(48)));
    }


}
