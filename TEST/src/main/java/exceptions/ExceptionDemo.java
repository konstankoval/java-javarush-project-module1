package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    static Scanner scanner = new Scanner(System.in);
    int a = 5;
    int b = 0;

    void main() {

        System.out.println("Начало операции...");

        try {
            add();
        } catch (InputMismatchException e) {
            System.out.println("\nВнимание, перехвачено исключение: " + e);
            System.out.println("Попробуйте снова\n");
            scanner.nextLine();
            main();
        } catch (MyException e) {
            System.out.println("\nВнимание, перехвачено исключение: " + e);
            System.out.println("Попробуйте снова\n");

            main();
        }

        System.out.println("Конец операции");

    }

    void add(){

        System.out.println("Параметр №1 проинициализирован как " + a);
        System.out.println("Проинициализируйте Параметр №2");
        int b = scanner.nextInt();
        if (b < 0) {
            throw new MyException("Параметр не может быть меньше 0");
        }

        System.out.println("Результат сложения: ");
        System.out.println(a + b);
    }
}
