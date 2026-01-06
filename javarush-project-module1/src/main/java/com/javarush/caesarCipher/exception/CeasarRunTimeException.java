package com.javarush.caesarCipher.exception;

// Непроверяемые исключения

public class CeasarRunTimeException extends RuntimeException {
    public CeasarRunTimeException(String message) {
        // todo: вызвать конструктор родителя с сообщением
    }

    public CeasarRunTimeException(String message, Throwable cause) {
        // todo: вызвать конструктор родителя с сообщением и причиной
    }
}



// Можно кидать сюда все возможные ошибки, которые могут возникнуть по нашему мнению:
// Слишком большой файл - исключение
// Файл пуст - исключение
// в айле не текст - исключение и т.д.
