package polymorph;

import Interface.Veihcle;

public class Car extends Vehicles {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public String driverName() {
        String name = "Driver";
        return name;
    }
}
