package baihoc.tuan03_buoi2.kethua;

import baihoc.tuan03_buoi2.Animal;

public class Lion extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Making Lion noise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eatting meat");
    }
}
