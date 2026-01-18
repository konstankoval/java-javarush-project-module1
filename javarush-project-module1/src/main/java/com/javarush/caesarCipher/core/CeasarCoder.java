package com.javarush.caesarCipher.core;

import com.javarush.caesarCipher.exception.CeasarException;
import com.javarush.caesarCipher.model.ProcessingResult;
import com.javarush.caesarCipher.service.ValidationService;

import java.util.ArrayList;
import java.util.List;

public class CeasarCoder {

    private final ValidationService validationService;


    public CeasarCoder (ValidationService validationService) {

        this.validationService = validationService;
    }

    public ProcessingResult encodeText (String text, int codeForEncode) throws CeasarException {

        // 1. Валидировать входной текст
        validationService.validateTextForEncoding(text, codeForEncode);

        // 2. Приветси в верхнему регистру
        String upperText = text.toUpperCase();
        StringBuilder result = new StringBuilder();

        // 3. Пройти по всем символам
        // 4. Найти новый символ для каждого символа
        char[] charArray = upperText.toCharArray();
        List<Integer> intArray = new ArrayList<>(text.length());

        for (char element : charArray){
            if(((Alphabet.CEASAR_TO_TEXT.get(element))+codeForEncode) > Alphabet.CEASAR_TO_TEXT.size()){
                intArray.add(((Alphabet.CEASAR_TO_TEXT.get(element)) + codeForEncode) - (Alphabet.CEASAR_TO_TEXT.size()));
            } else intArray.add((Alphabet.CEASAR_TO_TEXT.get(element)) + codeForEncode);
        }

        for (int element : intArray){
            result.append(Alphabet.TEXT_TO_CEASAR.get(element));
        }

        String encoded = result.toString();

        // 6. Вернуть ProcessingResult
        return new ProcessingResult(true, "Текст успешно закодирован", getPreview(text), getPreview(encoded), encoded);

    }

    public ProcessingResult decodeText (String ceasarCode, int codeForDecode) throws CeasarException {

        // 1. Валидировать код Цезаря
        validationService.validateCeasarCode(ceasarCode, codeForDecode);

        // 2. Разбить на отдельные символы
        String upperText = ceasarCode.toUpperCase();
        StringBuilder result = new StringBuilder();

        // 3. Найти новый символ для каждого символа
        // 4. Обработать разделитель слов
        // 5. Собрать результат с пробелами
        char[] charArray = upperText.toCharArray();
        List<Integer> intArray = new ArrayList<>(ceasarCode.length());

        for (char element : charArray){
            if(((Alphabet.CEASAR_TO_TEXT.get(element)) - codeForDecode) < 1){
                intArray.add((Alphabet.CEASAR_TO_TEXT.size()) - (codeForDecode - (Alphabet.CEASAR_TO_TEXT.get(element))));
            } else intArray.add((Alphabet.CEASAR_TO_TEXT.get(element)) - codeForDecode);
        }

        for (int element : intArray) {
            result.append(Alphabet.TEXT_TO_CEASAR.get(element));
        }

        // 6. Вернуть ProcessingResult
        String decoded = result.toString();
        return new ProcessingResult(true, "Код успешно декодирован", getPreview(ceasarCode), getPreview(decoded), decoded);

    }

    public String getPreview(String text) {

        if (text.length() <= 100) {
            return text;
        }
        return text.substring(0, 97) + "...";
    }

}
