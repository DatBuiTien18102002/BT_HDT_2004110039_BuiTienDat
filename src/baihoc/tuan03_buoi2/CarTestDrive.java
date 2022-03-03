package baihoc.tuan03_buoi2;

public class CarTestDrive {
    public static void main(String[] args) {
        
        Car car = new Car("Xanh lá", 20000000);

        System.out.println("Car Color:"+ car.getCarColor());
        System.out.println("Car Price:"+ car.getCarPrice());
    }
}
