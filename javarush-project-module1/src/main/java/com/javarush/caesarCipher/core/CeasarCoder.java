package com.javarush.caesarCipher.core;

import com.javarush.caesarCipher.exception.CeasarException;
import com.javarush.caesarCipher.model.ProcessingResult;
import com.javarush.caesarCipher.service.ValidationService;

public class CeasarCoder {

    private final ValidationService validationService;


    public CeasarCoder (ValidationService validationService) {
        // todo: инициализировать ValidationService
        this.validationService = validationService;
    }

    public ProcessingResult encodeText (String text) throws CeasarException {
        // todo: кодирование текста в шифр Цезаря
        // 1. Валидировать входной текст
        // 2. Приветси в верхнему регистру
        // 3. Пройти по всем символам
        // 4. Найти новый символ для каждого символа
        // 5. Собрать результат с пробелами
        // 6. Вернуть ProcessingResult
        return null;
    }

    public ProcessingResult decodeText (String ceasarCode) throws CeasarException {
        // todo: декодирование кода Цезаря в текст
        // 1. Валидировать код Цезаря
        // 2. Разбить на отдельные символы
        // 3. Найти новый символ для каждого символа
        // 4. Обработать разделитель слов
        // 5. Собрать результат с пробелами
        // 6. Вернуть ProcessingResult
        return null;
    }

    public String getPreview(String text) {
        // todo: создание превью текста
        // 1. если текст короткий - вернуть как есть
        // 2. если текст длинный - обрезать и добавить "..."
        return null;
    }

}
