package inheritance_abstract;

import java.util.ArrayList;

public class Calculate {

    public static void main(String[] args) {

        Circle c = new Circle(2);
        Triangle t = new Triangle(2,3,4,5);
        Rectangle r = new Rectangle(2,3);

        ArrayList<GeometricalFigure> geometricalList = new ArrayList<>();

        geometricalList.add(r);
        geometricalList.add(t);
        geometricalList.add(c);

        for(int i = 0; i < geometricalList.size(); i++){
            System.out.println(geometricalList.get(i).calculateArea());
            System.out.println(geometricalList.get(i).calculatePerimter());
        }

    }
}
