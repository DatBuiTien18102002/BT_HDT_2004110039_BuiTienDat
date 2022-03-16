public class Con1 extends Cha{
    int b;

    public Con1(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + "Con1 [b=" + b + "]";
    }

    public Con1() {

    }
    
}
