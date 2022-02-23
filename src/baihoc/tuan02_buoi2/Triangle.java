package baihoc.tuan02_buoi2;

public class Triangle {
    
    private String soundFile;

    Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    public void rotate(){
        System.out.println("Xoay hinh 360 do theo chieu kim dong ho");
        this.playSound();
    }


    public void playSound(){
        System.out.println("Phat am thanh tu file " + this.soundFile);
    }
}
