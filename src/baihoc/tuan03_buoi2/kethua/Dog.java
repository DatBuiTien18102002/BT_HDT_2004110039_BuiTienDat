package baihoc.tuan03_buoi2.kethua;

import baihoc.tuan03_buoi2.Animal;

public class Dog extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Making Gau Gau...");

    }

    @Override
    protected void eat() {
        System.out.println("Eating bone");
    }

    public void protectHouse(){
        System.out.println("Protecting ...");
    }

    
}
