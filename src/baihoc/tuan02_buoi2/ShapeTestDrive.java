package baihoc.tuan02_buoi2;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
        Circle circle = new Circle("hinhtron.aif");
        Square square = new Square("hinhvuong.aif");
        Triangle triangle = new Triangle("hinhtamgiac.aif");
        Amoeba amoeba = new Amoeba("hinhamoeba.hif",5.5,10.5);

        circle.rotate();
        square.rotate();
        triangle.rotate();
        amoeba.rotate();

    }
}
