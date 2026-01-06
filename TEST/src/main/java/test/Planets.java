package test;

abstract class Planets {
    abstract double calculateRadius();
    abstract double calculateArea();
    abstract double timeToSun();

    public void printInfo() {
        System.out.println("Длина радиуса планеты (км): " + calculateRadius());
        System.out.println("Площадь поверхности планеты (кв.км): " + calculateArea());
        System.out.println("Время прохождения радиосигнала до Солнца (сек): " + timeToSun());
    }

}
