package com.javarush.caesarCipher.exception;

// Проверяемые исключения

public class CeasarException extends Exception {
    public CeasarException(String message) {
        // todo: вызвать конструктор родителя с сообщением
        System.out.println("\nВнимание! Ошибка!");
        System.out.println(message);
    }

    public CeasarException(String message, Throwable cause) {
        // todo: вызвать конструктор родителя с сообщением и причиной
        System.out.println("\nВнимание! Ошибка!");
        System.out.println(message + cause);
    }
}



// Можно кидать сюда все возможные ошибки, которые могут возникнуть по нашему мнению:
// Слишком большой файл - исключение
// Файл пуст - исключение
// в файле не текст - исключение и т.д.
