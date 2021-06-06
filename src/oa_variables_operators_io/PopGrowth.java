package oa_variables_operators_io;

public class PopGrowth {

    /**
     * @Jonas Munk Christensen
     * 10.02.2021
     *
     * Current population int the US i 331,002,651. Calculate and print growht
     * and total population after 5 years
     */

    public static void main(String[] args) {

        // Define constants
        final double birthSec = 7.0;  // in seconds
        final double deathSec = 13.0; // in seconds
        final int currentPop = 331002651;
        final double secInYear = (365.25 * 24.0 * 60.0 * 60.0);
        double birth5Year;
        double death5Year;
        int growth;
        int sum;

        // Calculate number of births in 5 years
        birth5Year = (secInYear / birthSec) * 5;

        // Calculate number of deaths in 5 years
        death5Year =  (secInYear / deathSec) * 5;

        // Calculate population growth in 5 years and covert to integer
        growth = (int)(birth5Year - death5Year);

        // Calculate total population after 5 years
        sum = currentPop + growth;

        // Output result
        System.out.printf("The US has a current population of %,d \n", currentPop);
        System.out.printf("In 5 years the population will have grown by %,d \n", growth);
        System.out.printf("and the total population will be %,d \n", sum);
    }
}
