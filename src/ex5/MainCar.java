package ex5;

public class MainCar {
    // Viết main để test chuyển đổi engine, tăng tốc giảm tốc, quan sát fuelLevel.
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        
        car.setEngine(new ElectricEngine());
        car.accelerate();
        car.refuel(2);
        car.accelerate();
        car.accelerate();
        car.brake();
        car.brake();

        car.setEngine(new DieselEngine());
        car.refuel(10);
        car.accelerate();
    }
    
}
