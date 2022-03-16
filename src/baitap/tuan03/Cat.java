package baitap.tuan03;

public class Cat extends Feline implements Pet{
    @Override
    protected void makeNoise() {
        System.out.println("Cat making noise meow meow");
    }
    @Override
    public void beFriendly() {
        
        
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    // @Override
    // protected void eat() {
    //     System.out.println("Eating fish");
    // }
}
