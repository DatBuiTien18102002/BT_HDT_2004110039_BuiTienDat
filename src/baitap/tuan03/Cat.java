package baitap.tuan03;

public class Cat extends Feline{
    @Override
    protected void makeNoise() {
        System.out.println("Cat making noise meow meow");
    }

    @Override
    protected void eat() {
        System.out.println("Eating fish");
    }
}
