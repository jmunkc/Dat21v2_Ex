public class AreaAndPerimterRectangle {

    // Write variables to represent a rectangle:
    // •width of 5.5
    // •height of 8.5
    // Compute the area & perimeter of the rectangle and print the results.

    public static void main(String[] args) {

        double width = 5.5;
        double height = 8.5;

        double area = width * height;

        double perimter = 2 * (width * height);

        System.out.print("A rectangle with width 5.5 and height 8.5 has an area of ");
        System.out.print(area);
        System.out.print(" and a perimeter of ");
        System.out.print(perimter);

    }
}
