package com.javarush.caesarCipher.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    public static final Map<Character, String> TEXT_TO_CEASAR;
    public static final Map<String, Character> CEASAR_TO_TEXT;


    // блок статик. Этот код будет создаваться при загрузке
    // тут будут мапы, коллекции
    static {
        // todo: инициализировать алфавит шифра Цезаря
        // создать временный hashMap
        Map<Character, String> textToCeasar = new HashMap<>(); // Возможно использовать карту Character + Integer!
        Map<String, Character> ceasarToText = new HashMap<>(); // Возможно использовать карту Integer + Character!

        // заполнить русские буквы


        // заполнить цифры (опция)
        // заполнить пунктуацию (опция)
        textToCeasar.put(' ', "/");
        // создать обратное отображение
        for (Map.Entry<Character, String> entry : textToCeasar.entrySet()) { // поменять на I+C
            ceasarToText.put(entry.getValue(), entry.getKey());
        }

        // сделать коллекции неизменяемыми
        TEXT_TO_CEASAR = Collections.unmodifiableMap(textToCeasar);
        CEASAR_TO_TEXT = Collections.unmodifiableMap(ceasarToText);
    }

    private Alphabet() {}
}


