package baitap.tuan03;

public class Cow extends Animal{

    @Override
    protected void makeNoise() {
        System.out.println(" Cow sound...");
        
    }

    @Override
    protected void eat() {
        System.out.println("Cow eating...");
        
    }
    
}
