package polymorph;

public class Main {
    static void main() {
        Plane plane = new Plane();
        Car car = new Car();


        System.out.println(plane.driverName());
        plane.move();

        System.out.println(car.driverName());
        car.move();

    }
}
