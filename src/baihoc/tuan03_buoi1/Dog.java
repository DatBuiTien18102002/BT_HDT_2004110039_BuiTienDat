package baihoc.tuan03_buoi1;

public class Dog {

    //attribute - datav -field
    private int size; //implementation
    /**default - mặc định*/private String name; //interface
    /**default*/private String breed; // interface


    //methods
    //interface
    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Size unvalid(Không hợp lệ)!!");
        }
    }




}
