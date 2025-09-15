package ex5;

public class Car {
    private Engine engine;
    private int speed;
    private double fuelLevel;

    public Car() {
        this.speed = 0;
        this.fuelLevel = 0.0;
    }
    //setEngine(Engine), accelerate(), brake(), refuel(double).

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void accelerate() {
        this.engine.run();
        if (engine != null && fuelLevel > 0) {
            speed += 10;
            fuelLevel -= 1;
            System.out.println("Accelerating. Speed: " + speed + " km/h, Fuel level: " + fuelLevel + " liters.");
        } else {
            System.out.println("Cannot accelerate. Check engine and fuel level.");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) speed = 0;
            System.out.println("Braking. Speed: " + speed + " km/h.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " liters. Current fuel level: " + fuelLevel + " liters.");
        } else {
            System.out.println("Refuel amount must be positive.");
        }
    }
}
