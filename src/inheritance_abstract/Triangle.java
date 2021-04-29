package inheritance_abstract;

public class Triangle extends GeometricalFigure{
    private double sideA, sideB, sideC, height;

    public Triangle(double sideA, double sideB, double sideC, double height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;

    }

    @Override
    public double calculateArea(){

        return this.sideA * height * 0.5;
    }

    @Override
    public double calculatePerimter(){
        return this.sideA + sideB + sideC;
    }
}
