package baitap.tuan03;

public class Lion extends Feline{
    @Override
    protected void makeNoise() {
        System.out.println("Lion making noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating meat");
    }
}
