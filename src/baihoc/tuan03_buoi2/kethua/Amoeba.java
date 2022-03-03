package baihoc.tuan03_buoi2.kethua;

public class Amoeba extends Shape{

    private double xPoint;
    private double yPoint;


    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }
    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    public void rotate(){
        System.out.println("Xoay hinh 360 do theo chieu kim dong ho tai X: " + this.xPoint + " y: " + this.yPoint);
        
    }

    @Override
    public void playSound(){
        System.out.println("Phat am thanh tu file .hif " + this.getSoundFile() + " music" );
    }
}
