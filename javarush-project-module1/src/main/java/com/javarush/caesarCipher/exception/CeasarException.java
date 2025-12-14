package com.javarush.caesarCipher.exception;

// Проверяемые исключения

public class CeasarException extends Exception {
    public CeasarException(String message) {
        // todo: вызвать конструктор родителя с сообщением
    }

    public CeasarException(String message, Throwable cause) {
        // todo: вызвать конструктор родителя с сообщением и причиной
    }
}



// Можно кидать сюда все возможные ошибки, которые могут возникнуть по нашему мнению:
// Слишком большой файл - исключение
// Файл пуст - исключение
// в айле не текст - исключение и т.д.
