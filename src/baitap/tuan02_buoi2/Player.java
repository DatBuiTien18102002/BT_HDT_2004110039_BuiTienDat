package baitap.tuan02_buoi2;

public class Player {
    
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
    }

    public int getNumber(){
        return number;
    }
    
}
