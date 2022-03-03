package baihoc.tuan03_buoi2.kethua;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setSoundFile("circle.aif");
        circle.playSound();
        circle.rotate();

        Square square = new Square();
        square.setSoundFile("square.aif");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle();
        triangle.setSoundFile("triangle.aif");
        triangle.playSound();
        triangle.rotate();

        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSoundFile("amoeba.hif");
        amoeba.rotate();
        amoeba.playSound();
    }
}
