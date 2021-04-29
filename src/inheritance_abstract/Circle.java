package inheritance_abstract;

public class Circle extends GeometricalFigure{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return this.radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimter(){
        return this.radius * 2 * Math.PI;
    }
}
