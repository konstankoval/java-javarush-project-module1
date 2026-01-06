package polymorph;

public class Plane extends Vehicles{
    @Override
    public void move() {
        System.out.println("PLane is flying");
    }

    @Override
    public String driverName() {
        String name = "Pilot";
        return name;
    }
}
