package test;

public class Earth extends Planets{
    final private double radius;
    final private double orbitHeight;

    public Earth(double radius, double orbitHeight) {
        this.radius = radius;
        this.orbitHeight = orbitHeight;
    }

    @Override
    double calculateRadius() {
        return Math.PI * radius * 2;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double timeToSun() {
        return orbitHeight / 300_000;
    }
}
