package baitap.tuan03;

public class Hippo extends Animal{
    
    @Override
    protected void makeNoise() {
        System.out.println("Hippo make noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating grass");
    }
}
