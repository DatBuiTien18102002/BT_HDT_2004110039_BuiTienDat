package baihoc.tuan03_buoi2;

public class Animal {
    private String picture;
    private String food;
    private int hunger;

    protected void makeNoise(){
        System.out.println("Make noise....");
    }
    protected void sleep(){
        System.out.println("Slepping....");
    }
    protected void roam(){
        System.out.println("Roaming...");
    }
    protected void eat(){
        System.out.println("Eating...");
    }
}
