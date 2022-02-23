package baihoc.tuan03_buoi1;

public class IntSquare {
    


    private double squareValue;//implementation

    //interface
    // public double getSquareOperator(int value){
    //     this.squareValue = value * value;//operator X
    //     return this.squareValue;
    // }

    //version 2 error
    // public double getSquareMath(int value){
    //     this.squareValue = Math.pow(value, 2);//operator X
    //     return this.squareValue;
    // }


    //interface
    public double getSquare(int value){
        //implementation - thuật toán
        this.calculateSquare(value);
        return this.squareValue;
    }

    //implementation
    private void calculateSquare(int value){
        this.squareValue = value * value;//Math
    }



}
