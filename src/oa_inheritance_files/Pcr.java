package oa_inheritance_files;

import java.time.LocalDateTime;

// Sub class of CovidTest
public class Pcr extends CovidTest{

    // Extension of CovidTest constructor
    public Pcr(){super("Throat swab", "Hospital", LocalDateTime.now());}

    // Overridden method from CovidTest
    public void calcAnswerTime(){
        super.setAnswerTime((super.getTestDateTime().plusHours(24)));
    }

}
