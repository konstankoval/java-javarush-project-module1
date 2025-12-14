package com.javarush.caesarCipher;

import com.javarush.caesarCipher.core.CeasarCoder;
import com.javarush.caesarCipher.exception.CeasarException;
import com.javarush.caesarCipher.model.ProcessingResult;
import com.javarush.caesarCipher.service.FileService;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *  Проект модуля 1 - точка входа
 */
public class CaesarCipherApp {

    // todo: поля класса - зависимости
    private final CeasarCoder ceasarCoder;
    private final FileService fileService;
    private final Scanner scanner;

    // todo: конструктор - инициализация зависимостей
    public CaesarCipherApp(CeasarCoder ceasarCoder, FileService fileService, Scanner scanner) {
        this.ceasarCoder = ceasarCoder;
        this.fileService = fileService;
        this.scanner = scanner;
    }


    static void main() {
        CaesarCipherApp app = new CaesarCipherApp();
    }

    public void run(){
        // todo: реализовать главный цикл приложения
        // 1. Вывести приветстиве
        printWelcomeMessage();

        // 2. Меню в виде бесконечного цикла*
        while(true) {
            showMainMenu();
            String choice = scanner.nextLine();

            // 3. Обработка выбора пользователя
            // 4. * Выход из меню по команде
            switch (choice) {
                case "1":
                    processEncodeFile();
                    break;

                case "2":
                    processDecodeFile();
                    break;

                case "3":
                    showAlphabet();
                    break;

                case "0":
                    System.out.println("\nДо свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }


    }

    private void printWelcomeMessage() {
        // todo: красивое приветствие с названием приложения
        System.out.println("Шифр Цезаря. Версия 1.0");
    }

    private void showMainMenu(){
        // todo: отобразить меню с вариантами действий
        System.out.println("Главное меню:");
        System.out.println("1 - Закодировать текст");
        System.out.println("2 - Декодировать текст");
        System.out.println("3 - Справка по алфавиту");
        System.out.println("0 - Выход");
        System.out.print("Выберите действие: ");
    }

    // НУЖНО ДОБАВИТЬ КЛЮЧ-ЧИСЛО ДЛЯ КОДИРОВАНИЯ СООБЩЕНИЯ
    private void ceasarOffsetKey() {

    }

    private void processEncodeFile() {
        // todo: обработка кодирования файла
        // 1. Получить пути файлов
        // 2. Прочитать исходный файл
        // 3. Закодировать текст
        // 4. Записать результат
        // 5. Сообщить об успешном результате
        System.out.println("Кодирование файла:");
        try {
            String inputFile = getInputFilePath();
            String outputFile = getOutputFilePath();

            String context = fileService.readFile();
            ProcessingResult result = ceasarCoder.encodeText(context);
            fileService.writeFile(getOutputFromResult(result), outputFile);

            displaySuccessResult(result, inputFile, outputFile);
        } catch (CeasarException e) {
            displayError(e.getMessage());
        }

    }

    private void processDecodeFile() {
        // todo: обработка декодирования файла
        // 1. Получить пути файлов
        // 2. Прочитать файл
        // 3. Декодировать код
        // 4. Сообщить об успешном результате
    }

    // проектирование методов

    private String getInputFilePath(){
        // запрос пути исходного файла
        return null;
    }

    private String getOutputFilePath(){
        // запрос пути для записи результата
        return null;
    }

    private void displaySuccessResult(ProcessingResult result, String inputFile, String outputFile){
        // todo: вывод успешного результата
    }

    private void displayError(String message){
        // todo: вывод сообщения об ошибке
    }

    private void showAlphabet(){
        // todo: вывод алфавита по запросу
    }

    private String getOutputFromResult(ProcessingResult result) {

    }


}
