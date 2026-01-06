package test;

public class Main {
    static void main() {
        Planets Earth = new Earth(150000.0, 3000000.0);
        Planets Venus = new Earth(100000.0, 1000000.0);

        Earth.printInfo();
        Venus.printInfo();

    }
}
