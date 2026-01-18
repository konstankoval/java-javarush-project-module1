package com.javarush.caesarCipher.exception;

// Непроверяемые исключения

public class CeasarRunTimeException extends RuntimeException {
    public CeasarRunTimeException(String message) {
        super(message);
    }

    public CeasarRunTimeException(String message, Throwable cause) {
        super(message+cause);
    }
}




