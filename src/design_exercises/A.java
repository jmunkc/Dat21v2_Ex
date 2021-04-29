package design_exercises;

public class A {

    private B myB = new B();

    public void doOne(){

        System.out.println("tal = 1");

        myB.doTwo();
        myB.doThree();
    }
}
