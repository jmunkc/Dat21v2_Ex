public class FahrenheitToCelciusConverter {

    public static void main(String[] args){

        double tempF = 100.0;
        double tempC = (tempF - 32.0) / 1.8;
        String converterText = ("Temperature converted from fahrenheit to celcius");

        System.out.println(converterText);
        System.out.print(tempF);
        System.out.print(" F");
        System.out.print(" = ");
        System.out.print(tempC);
        System.out.println(" C");

    }

}
