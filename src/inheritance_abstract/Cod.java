package inheritance_abstract;

public class Cod extends Animal{

    public Cod(String name, int nrOfLegs, boolean isMammal){
        super(name, nrOfLegs, isMammal);
    }

    @Override
    public void makeSound(){
        System.out.println("blop blop");
    }


}
