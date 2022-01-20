package baihoc.tuan02_buoi2;

public class Triangle {
    
    String soundFile;

    Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay hinh 360 do thei chieu kim dong ho");
    }


    void playSound(){
        System.out.println("Phat am thanh tu file " + soundFile);
    }
}
