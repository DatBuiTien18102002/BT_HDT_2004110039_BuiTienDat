package baitap.tuan03;

public class Dog extends Canine implements Pet{
    @Override
    protected void makeNoise() {
        System.out.println("Making Gau Gau...");

    }

    @Override
    protected void eat() {
        System.out.println("Eating bone");
    }
    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }
}
