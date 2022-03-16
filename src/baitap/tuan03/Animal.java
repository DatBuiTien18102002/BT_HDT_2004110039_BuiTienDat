package baitap.tuan03;

public abstract class  Animal {
    
    private String picture;
    private String food;
    private int hunger;
    private int boundaries;
    private int location;

    protected abstract void makeNoise();
      
    
    protected void sleep(){
        System.out.println("Slepping....");
    }
    protected void roam(){
        System.out.println("Roaming...");
    }
    protected abstract void eat();// hop dong
    
    
    


}
