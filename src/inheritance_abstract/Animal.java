package inheritance_abstract;

public abstract class Animal {

    private String name;
    private int nrOfLegs;
    private boolean isMammal;

    public Animal(String name, int nrOfLegs, boolean isMammal){
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }

    public abstract void makeSound();
}
