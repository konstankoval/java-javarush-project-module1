package com.javarush.caesarCipher.service;

import com.javarush.caesarCipher.core.Alphabet;
import com.javarush.caesarCipher.exception.CeasarException;

public class ValidationService {

    public void validateTextForEncoding(String text) throws CeasarException {
        // 1. Валидация на null и пустоту
        if (text == null || text.trim().isEmpty()) {
            throw new CeasarException("Текст для кодирования не может быть пустым!");
        }

        // 2. Пройти по всем символам
        // 3. Проверить наличие в алфавите
        // 4. Выбросить исключение с инфо о позиции ошибки
        String upperText = text.toUpperCase();
        for (int i = 0; i < upperText.length(); i++) {
            char c = upperText.charAt(i);
            if(!Alphabet.TEXT_TO_CEASAR.containsKey(c)) {
                throw new CeasarException("Неподдерживаемый символ " + c + " в позиции " + (i + 1));
            }
        }


    }

    public void validateCeasarCode(String ceasarCode) throws CeasarException {
        // 1. Валидация на null и пустоту
        if (ceasarCode == null || ceasarCode.trim().isEmpty()) {
            throw new CeasarException("Код для декодирования не может быть пустым!");
        }


        // 2. Разбить на отдельные коды
        String[] symbols = ceasarCode.trim().split(" ");



        // 3. Проверить каждый код (кроме разделителя слов)
        // 4. Выбросить исключение с инфо о позиции ошибки
        for(int i = 0; i < symbols.length; i++) {
            String symbol = symbols[i];
            if (!symbol.equals("/") && !Alphabet.CEASAR_TO_TEXT.containsKey(symbol)) {
                throw new CeasarException("Некорректный символ кодировки " + symbol + " в позиции " + (i + 1));
            }
        }
    }
}
