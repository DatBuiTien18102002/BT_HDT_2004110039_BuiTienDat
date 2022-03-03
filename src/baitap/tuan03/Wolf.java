package baitap.tuan03;

public class Wolf extends Canine{
    @Override
    protected void makeNoise() {
        System.out.println("Wolf making noise ");
    }

    @Override
    protected void eat() {
        System.out.println("Eating meat");
    }
}
