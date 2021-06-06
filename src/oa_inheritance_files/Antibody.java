package oa_inheritance_files;

import java.time.LocalDateTime;

public class Antibody extends CovidTest{

    public Antibody(){super("Blood sample", "Private Clinic", LocalDateTime.now());}


    @Override
    public void runTest(){
        System.out.println("Test is running...");
        this.testResult = true;
    }


}
