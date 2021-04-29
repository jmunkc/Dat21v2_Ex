public class AreaAndPerimterCircle {

    // Write a variable to represent a circle
    // •Radius of 16
    // Compute the area & perimeter of the circle and print the results

    public static void main(String[] args){

        double radius = 16.0;
        double pi = 3.14159265359;
        double area = pi * radius * radius;
        double perimeter =  2 * pi * radius;

        System.out.print("The area & perimeter of a circle with a radius of 16, has an area of ");
        System.out.print(area);
        System.out.print(" and a perimter of ");
        System.out.println(perimeter);
    }
}
