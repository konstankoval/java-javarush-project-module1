package com.javarush.caesarCipher.exception;

// Проверяемые исключения

public class CeasarException extends Exception {
    public CeasarException(String message) {
        super(message);
    }

    public CeasarException(String message, Throwable cause) {
        super(message+cause);
    }
}



