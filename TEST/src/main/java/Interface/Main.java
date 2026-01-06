package Interface;

public class Main {
    static void main() {
        Driver driver = new Driver();
        Car car = new Car();
        Truck truck = new Truck();

        driver.driver(car);
        driver.driver(truck);
    }
}
