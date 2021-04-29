package inheritance_abstract;

public class Kangaroo extends Animal{
    
    public Kangaroo(String name, int nrOfLegs, boolean isMammal){
        super(name, nrOfLegs, isMammal);        
    }
    
    @Override
    public void makeSound(){
        System.out.println("G'day mate");
    }
    
}
