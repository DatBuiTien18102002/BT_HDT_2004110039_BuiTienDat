package baihoc.tuan03_buoi2;

public class Car {
    
    private String carColor;
    private double carPrice;

    public Car(String carColor, double carPrice){
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public String getCarColor(){
        return this.carColor;
    }

    public double getCarPrice(){
        return this.carPrice;
    }

}
