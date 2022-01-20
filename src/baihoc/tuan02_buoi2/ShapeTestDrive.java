package baihoc.tuan02_buoi2;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
        Circle circle = new Circle("hinhtron.aif");
        Square square = new Square("hinhvuong.aif");
        Triangle triangle = new Triangle("hinhtamgiac.aif");

        circle.rotate();
        circle.playSound();

        square.rotate();
        square.playSound();

        triangle.rotate();
        triangle.playSound();
    }
}
