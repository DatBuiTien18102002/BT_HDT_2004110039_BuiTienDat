package baitap.tuan01_buoi2;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
        Shape shape1 = new Shape("Square",15,"yelow","Guitar sound");
        Shape shape2 = new Shape("Circle",10,"red","Flute sound");
        Shape shape3 = new Shape("Triangle",20,"blue","Piano sound");

        shape1.rotateClockwise();
        shape1.playAudio();

        shape2.rotateClockwise();
        shape2.playAudio();

        shape3.rotateClockwise();
        shape3.playAudio();



    }
}
