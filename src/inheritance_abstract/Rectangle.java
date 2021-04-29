package inheritance_abstract;

public class Rectangle extends GeometricalFigure{

    private double sideA, sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea(){
        return this.sideA * sideB;
    }

    @Override
    public double calculatePerimter(){
        return this.sideA * 2 + sideB * 2;
    }
}
