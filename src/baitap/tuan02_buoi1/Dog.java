package baitap.tuan02_buoi1;

public class Dog {
    
    int size = 14 ;
    String breed;
    String name;

    void bark(){
        if(size >14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");

        }
    }

    void setBigger(){
        size += 5;
    }

    void run(){
        System.out.println("Running ...");
        this.bark();
    }


}
