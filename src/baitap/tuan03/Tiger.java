package baitap.tuan03;

public class Tiger extends Feline{

    @Override
    protected void makeNoise() {
        System.out.println("Tiger making noise ...");
    }
    
    @Override
    protected void eat() {
        System.out.println("Eating meat");
    }
}
