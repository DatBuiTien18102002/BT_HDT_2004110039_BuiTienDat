package baihoc.tuan03_buoi2.kethua;

public class Shape {
    private String soundFile;

    public String getSoundFile() {
        return soundFile;
    }

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public Shape(){

    }

    public Shape(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Rotating 360....");
    }

    void playSound(){
        System.out.println("Play file .aif "+this.soundFile +" music ");
    }
}
