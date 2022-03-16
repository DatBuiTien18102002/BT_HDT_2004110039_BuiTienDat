package baihoc.tuan5;

public class Circle extends Shape{
    private int radius;

    public Circle(int _x, int _y, int _r) {
        super(_x, _y);
        this.radius = _r;
    }
    @Override
    public void draw(){
        System.out.println("Draw circle at"+x+","+y);
    }
    @Override
    public void erase() {
        System.out.println("Erase circle at "+x+","+y);
    }
    
}
