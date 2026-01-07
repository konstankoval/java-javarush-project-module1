package com.javarush.caesarCipher.service;

import com.javarush.caesarCipher.exception.CeasarException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileService {

    public String readFile(String filePath) throws CeasarException {

        // 1. Преобразовать путь в Path
        try{Path path = Path.of(filePath);

            // 2. Проверить существование файла
            if (!Files.exists(path)) {
                throw new CeasarException("Файл не найден " + filePath);
            }

            // 3. Проверить права на чтение
            if (!Files.isReadable(path)) {
                throw new CeasarException("Нет прав на чтение файла " + filePath);
            }

            return Files.readString(path);

            // 5. обработать IOException
        } catch (IOException e) {
            throw new CeasarException("Ошибка чтения файла " + e.getMessage(), e);
        }
    }

    public void writeFile(String content, String filePath) throws CeasarException {

        try{
            // 1. Преобразовать путь
            Path path = Path.of(filePath);
            Path parentDir = path.getParent();


            // 2. создать родителдьские директории
            if (parentDir != null && !Files.exists(parentDir)) {
                Files.createDirectories(parentDir);
            }


            // 3. записать содержимое с правильными опциями
            Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);


            // 4. Обработать IOException
        } catch (IOException e) {
            throw new CeasarException("Ошибка записи файла " + e.getMessage(), e);
        }
    }

    public boolean fileExists(String filePath) {
        return Files.exists(Path.of(filePath));
    }
}
