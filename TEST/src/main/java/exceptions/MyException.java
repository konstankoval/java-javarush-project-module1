package exceptions;

public class MyException extends RuntimeException {
    public MyException(String message) {
        System.out.println("Внимание, ошибка!");
        super(message);
    }
}
