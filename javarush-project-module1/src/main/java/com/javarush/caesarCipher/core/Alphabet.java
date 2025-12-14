package com.javarush.caesarCipher.core;

import java.util.Map;

public class Alphabet {
    public static final Map<Character, String> TEXT_TO_CEASAR;
    public static final Map<String, Character> CEASAR_TO_TEXT;

    static {
        // todo: инициализировать алфавит шифра Цезаря
        // создать временный hashMap
        // заполнить русские буквы
        // заполнить цифры (опция)
        // заполнить пунктуацию (опция)
        // создать обратное отображение
        // сделать коллекции неизменяемыми
        TEXT_TO_CEASAR = null;
        CEASAR_TO_TEXT = null;
    }

    private Alphabet() {
        // todo: запрет на создание. Утилитарный класс
    }
}


