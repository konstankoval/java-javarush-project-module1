package test;

public class Venus extends Planets {
    final private double radius;
    final private double orbitHeight;

    public Venus(double radius, double orbitHeight) {
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
