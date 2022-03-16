package baihoc.tuan5;

abstract public class Shape {
    protected int x,y;

    public Shape(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        draw();
    }

    
}
