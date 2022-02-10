package baihoc.tuan02_buoi2;

public class Amoeba {
    String soundFile;
    double xPoint;
    double yPoint;

    Amoeba(String soundFile, double xPoint, double yPoint){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay hinh 360 do theo chieu kim dong ho tai X: " + xPoint + " y: " + yPoint);
        this.playSound();
    }


    void playSound(){
        System.out.println("Phat am thanh tu file " + this.soundFile);
    }
}