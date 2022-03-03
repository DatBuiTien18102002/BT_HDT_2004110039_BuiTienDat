package baitap.tuan03;

public class Dog extends Canine{
    @Override
    protected void makeNoise() {
        System.out.println("Making Gau Gau...");

    }

    @Override
    protected void eat() {
        System.out.println("Eating bone");
    }
}
