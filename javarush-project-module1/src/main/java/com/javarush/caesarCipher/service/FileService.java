package com.javarush.caesarCipher.service;

import com.javarush.caesarCipher.exception.CeasarException;

public class FileService {

    public String readFile(String filePath) throws CeasarException {
        // todo: чтение файла с валидацией
        // 1. Преобразовать путь в Path
        // 2. Проверить существование файла
        // 3. Проверить права на чтение
        // 4. Проверить содержимое
        // 5. обработать IOException
        return null;
    }

    public void writeFile(String content, String filePath) throws CeasarException {
        // todo: запись файла с созданием директории
//        1. Преобразовать путь
//        2. создать родителдьские директории
//        3. записать содержимое с правильными опциями
//        4. Обработать IOException
    }

    public boolean fileExists(String filePath) {
        // todo: проверка существования файла
        return false;
    }
}
