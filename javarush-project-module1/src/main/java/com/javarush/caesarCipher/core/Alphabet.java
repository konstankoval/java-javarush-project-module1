package com.javarush.caesarCipher.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Alphabet {
    public static final Map<Integer, Character> TEXT_TO_CEASAR;
    public static final Map<Character, Integer> CEASAR_TO_TEXT;

    static {

        // создать временный hashMap
        Map<Integer, Character> textToCeasar = new HashMap<>();

        textToCeasar.put(1, 'А');
        textToCeasar.put(2, 'Б');
        textToCeasar.put(3, 'В');
        textToCeasar.put(4, 'Г');
        textToCeasar.put(5, 'Д');
        textToCeasar.put(6, 'Е');
        textToCeasar.put(7, 'Ё');
        textToCeasar.put(8, 'Ж');
        textToCeasar.put(9, 'З');
        textToCeasar.put(10, 'И');
        textToCeasar.put(11, 'Й');
        textToCeasar.put(12, 'К');
        textToCeasar.put(13, 'Л');
        textToCeasar.put(14, 'М');
        textToCeasar.put(15, 'Н');
        textToCeasar.put(16, 'О');
        textToCeasar.put(17, 'П');
        textToCeasar.put(18, 'Р');
        textToCeasar.put(19, 'С');
        textToCeasar.put(20, 'Т');
        textToCeasar.put(21, 'У');
        textToCeasar.put(22, 'Ф');
        textToCeasar.put(23, 'Х');
        textToCeasar.put(24, 'Ц');
        textToCeasar.put(25, 'Ч');
        textToCeasar.put(26, 'Ш');
        textToCeasar.put(27, 'Щ');
        textToCeasar.put(28, 'Ь');
        textToCeasar.put(29, 'Ы');
        textToCeasar.put(30, 'Ъ');
        textToCeasar.put(31, 'Э');
        textToCeasar.put(32, 'Ю');
        textToCeasar.put(33, 'Я');
        textToCeasar.put(34, ' ');
        textToCeasar.put(35, ',');
        textToCeasar.put(36, '.');
        textToCeasar.put(37, '!');
        textToCeasar.put(38, '?');
        textToCeasar.put(39, ':');
        textToCeasar.put(40, ';');
        textToCeasar.put(41, '/');
        textToCeasar.put(42, '(');
        textToCeasar.put(43, ')');
        textToCeasar.put(44, '\\');
        textToCeasar.put(45, '\'');
        textToCeasar.put(46, '\"');
        textToCeasar.put(47, '—');
        textToCeasar.put(48, '«');
        textToCeasar.put(49, '»');
        textToCeasar.put(50, '-');
        textToCeasar.put(51, '–');
        textToCeasar.put(52, '+');
        textToCeasar.put(53, '*');
        textToCeasar.put(54, '=');
        textToCeasar.put(55, '%');
        textToCeasar.put(56, '>');
        textToCeasar.put(57, '<');
        textToCeasar.put(58, ']');
        textToCeasar.put(59, '[');
        textToCeasar.put(60, '{');
        textToCeasar.put(61, '}');
        textToCeasar.put(62, '^');
        textToCeasar.put(63, '#');
        textToCeasar.put(64, '$');
        textToCeasar.put(65, '@');
        textToCeasar.put(66, '&');
        textToCeasar.put(67, '|');
        textToCeasar.put(68, '1');
        textToCeasar.put(69, '2');
        textToCeasar.put(70, '3');
        textToCeasar.put(71, '4');
        textToCeasar.put(72, '5');
        textToCeasar.put(73, '6');
        textToCeasar.put(74, '7');
        textToCeasar.put(75, '8');
        textToCeasar.put(76, '9');
        textToCeasar.put(77, '0');

        // создать обратное отображение
        Map<Character, Integer> ceasarToText = new HashMap<>();
        for (Map.Entry<Integer, Character> entry : textToCeasar.entrySet()) {
            ceasarToText.put(entry.getValue(), entry.getKey());
        }

        // сделать коллекции неизменяемыми
        TEXT_TO_CEASAR = Collections.unmodifiableMap(textToCeasar);
        CEASAR_TO_TEXT = Collections.unmodifiableMap(ceasarToText);
    }

    private Alphabet() {}
}


