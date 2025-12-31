package com.javarush.caesarCipher.core;

import com.javarush.caesarCipher.exception.CeasarException;
import com.javarush.caesarCipher.model.ProcessingResult;
import com.javarush.caesarCipher.service.ValidationService;

import java.util.ArrayList;
import java.util.List;

public class CeasarCoder {

    private final ValidationService validationService;


    public CeasarCoder (ValidationService validationService) {
        // todo: инициализировать ValidationService
        this.validationService = validationService;
    }

    public ProcessingResult encodeText (String text, int codeForEncode) throws CeasarException {
        // todo: кодирование текста в шифр Цезаря
        // 1. Валидировать входной текст
        validationService.validateTextForEncoding(text);

        // 2. Приветси в верхнему регистру
        String upperText = text.toUpperCase();
        StringBuilder result = new StringBuilder();

        // 3. Пройти по всем символам
        // 4. Найти новый символ для каждого символа
        char[] charArray = upperText.toCharArray();
        List<Integer> intArray = new ArrayList<>(text.length());

        for (char element : charArray){
            if(((Alphabet.CEASAR_TO_TEXT.get(element))+codeForEncode) > Alphabet.CEASAR_TO_TEXT.size()){
                intArray.add(((Alphabet.CEASAR_TO_TEXT.get(element))+codeForEncode) - (Alphabet.CEASAR_TO_TEXT.size()));
            } else intArray.add((Alphabet.CEASAR_TO_TEXT.get(element))+codeForEncode);
        }

        for (int element : intArray){
            result.append(Alphabet.TEXT_TO_CEASAR.get(element));
        }




        String encoded = result.toString();

            // 6. Вернуть ProcessingResult
            return new ProcessingResult(true, "Текст успешно закодирован", getPreview(text), getPreview(encoded));

    }

    public ProcessingResult decodeText (String ceasarCode, int codeForDecode) throws CeasarException {
        // todo: декодирование кода Цезаря в текст
        // 1. Валидировать код Цезаря
        validationService.validateCeasarCode(ceasarCode);

        // 2. Разбить на отдельные символы
        StringBuilder result = new StringBuilder();
        String[] symbols = ceasarCode.trim().split(" "); // ВОЗМОЖНО НУЖНО ИЗМЕНИТЬ!

        // 3. Найти новый символ для каждого символа
        // 4. Обработать разделитель слов
        // 5. Собрать результат с пробелами
        for (String symbol : symbols) {
            if (Alphabet.CEASAR_TO_TEXT.containsKey(symbol)) {
                result.append(Alphabet.TEXT_TO_CEASAR.get(symbol)); // ВОЗМОЖНО НУЖНО ИЗМЕНИТЬ!
            } else if (symbol.equals("/")) {
                result.append(" ");
            }
        }

        // 6. Вернуть ProcessingResult
        String decoded = result.toString();
        return new ProcessingResult(true, "Код успешно декодирован", getPreview(ceasarCode), getPreview(decoded));
    }

    public String getPreview(String text) {
        // todo: создание превью текста
        // 1. если текст короткий - вернуть как есть
        // 2. если текст длинный - обрезать и добавить "..."
        if (text.length() <= 100) {
            return text;
        }
        return text.substring(0, 97) + "...";
    }

}
