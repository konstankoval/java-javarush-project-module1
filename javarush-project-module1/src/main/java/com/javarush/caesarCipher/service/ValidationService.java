package com.javarush.caesarCipher.service;

import com.javarush.caesarCipher.exception.CeasarException;

public class ValidationService {

    public void validateTextForEncoding(String text) throws CeasarException {
        // todo: валидация текста для кодирования
        // 1. Валидация на null и пустоту
        // 2. Пройти по всем символам
        // 3. Проверить наличие в алфавите
        // 4. Выбросить исключение с инфо о позиции ошибки
    }

    public void validateCeasarCode(String message) throws CeasarException {
        // todo: валидация кода Цезаря
        // 1. Валидация на null и пустоту
        // 2. Разбить на отдельные коды
        // 3. Проверить каждый код (кроме разделителя слов)
        // 4. Выбросить исключение с инфо о позиции ошибки
    }
}
