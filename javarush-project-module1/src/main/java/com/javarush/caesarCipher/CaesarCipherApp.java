package com.javarush.caesarCipher;

import com.javarush.caesarCipher.core.Alphabet;
import com.javarush.caesarCipher.core.CeasarCoder;
import com.javarush.caesarCipher.exception.CeasarException;
import com.javarush.caesarCipher.model.ProcessingResult;
import com.javarush.caesarCipher.service.FileService;
import com.javarush.caesarCipher.service.ValidationService;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

/**
 *  Проект модуля 1 - точка входа
 *
 *  Путь к исходному файлу: E:\Java\Tasks\module 1\File for Encode.txt
 *  Путь к директории выходного файла: E:\Java\Tasks\module 1\Results\result.txt
 */
public class CaesarCipherApp {


    private static CeasarCoder ceasarCoder = new CeasarCoder(new ValidationService());
    private static FileService fileService = new FileService();
    private static Scanner scanner = new Scanner(System.in);


    public CaesarCipherApp(CeasarCoder ceasarCoder, FileService fileService, Scanner scanner) {
        this.ceasarCoder = ceasarCoder;
        this.fileService = fileService;
        this.scanner = scanner;
    }

    static void main() {
        CaesarCipherApp.run();
    }

    static void run() {

        CaesarCipherApp app = new CaesarCipherApp(ceasarCoder, fileService, scanner);

        // 1. Вывести приветстиве
        printWelcomeMessage();

        // 2. Меню в виде бесконечного цикла*
        boolean isOn = true;
        while(isOn) {

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
                    isOn = false;
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static void printWelcomeMessage() {

        System.out.println("Шифр Цезаря. Версия 1.0");
    }

    private static void showMainMenu(){

        System.out.println("Главное меню:");
        System.out.println("1 - Закодировать текст");
        System.out.println("2 - Декодировать текст");
        System.out.println("3 - Справка по алфавиту");
        System.out.println("0 - Выход");
        System.out.print("Выберите действие: ");
    }

    private static void processEncodeFile() {

        // 1. Получить пути файлов и шифр
        // 2. Прочитать исходный файл
        // 3. Закодировать текст
        // 4. Записать результат
        // 5. Сообщить об успешном результате
        System.out.println("Кодирование файла:");
        try {
            int codeForEncode = ceasarOffsetKey();
            String inputFile = getInputFilePath();
            String outputFile = getOutputFilePath();

            String context = fileService.readFile(inputFile);
            ProcessingResult result = ceasarCoder.encodeText(context, codeForEncode);
            fileService.writeFile(getOutputFromResult(result), outputFile);

            displaySuccessResult(result, inputFile, outputFile);
        } catch (CeasarException e) {
            displayError(e.getMessage());
        }

    }

    private static int ceasarOffsetKey() {
        System.out.print("Введите ключ для шифрования сообщения (число от 0 до 76): ");
        return scanner.nextInt();
    }

    private static void processDecodeFile() {


        System.out.println("Декодирование файла:");
        try {
            // 1. Получить пути файлов и код для дешифровки
            int codeForDecode = ceasarOffsetKey();
            String inputFile = getInputFilePath();
            String outputFile = getOutputFilePath();

            // 2. Прочитать файл
            String context = fileService.readFile(inputFile);

            // 3. Декодировать код
            ProcessingResult result = ceasarCoder.decodeText(context, codeForDecode);
            fileService.writeFile(getOutputFromResult(result), outputFile);

            // 4. Сообщить об успешном результате
            displaySuccessResult(result, inputFile, outputFile);
        } catch (CeasarException e) {
            displayError(e.getMessage());
        }

    }

    // проектирование методов

    private static String getInputFilePath(){
        // запрос пути исходного файла
        System.out.println("Введите путь к файлу с исходным сообщением");
        scanner.nextLine();
        return scanner.nextLine();
    }

    private static String getOutputFilePath(){
        // запрос пути для записи результата
        System.out.println("Введите путь к файлу, куда нужно записать закодированное сообщение");
        return scanner.nextLine();
    }

    private static void displaySuccessResult(ProcessingResult result, String inputFile, String outputFile){
        // todo: вывод успешного результата
        System.out.println("Сообщение из файла по адресу " + inputFile + " \nуспешно записано в файл по адресу " + outputFile);
        System.out.println("\nПревью результата записи: " + result.getOutputPreview());
    }

    private static void displayError(String message){
        // todo: вывод сообщения об ошибке
    }

    private static void showAlphabet(){

        System.out.println("\nСписок символов, подходящих для кодирования:");
        for (int i = 1; i <= Alphabet.TEXT_TO_CEASAR.size(); i++) {
                System.out.print(" [" + Alphabet.TEXT_TO_CEASAR.get(i) + "] ");
                if (i % 10 == 0){
                    System.out.println();
                }
            }
        System.out.println("\n");

        }


    private static String getOutputFromResult(ProcessingResult result) {
        String outputResult = result.getOutputMessage();

        return outputResult;
    }


}
