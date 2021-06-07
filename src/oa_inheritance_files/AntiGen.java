package oa_inheritance_files;

import java.time.LocalDateTime;

// Sub class of CovidTest
public class AntiGen extends CovidTest{

    // Extension of CovidTest constructor
    public AntiGen(){super("Nose swab", "Lokal Center", LocalDateTime.now());}

    // Overridden method from CovidTest
    public void calcAnswerTime(){
        super.setAnswerTime((super.getTestDateTime().plusMinutes(30)));
    }

}
