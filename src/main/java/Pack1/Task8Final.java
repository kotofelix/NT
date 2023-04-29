package Pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8Final {
    private static int getDigit(int number, int position) {
        return (number / (int) Math.pow(10, position)) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String randomComp = String.format("%04d", random.nextInt(10000)); //случайное число

        System.out.println("Загаданная строка: " + randomComp);

        int countBulls = 0;
        int countCows = 0;
        String yourNum;
        int attempts = 0;

        do {
            System.out.println("Введите число из 4-х цифр: ");
            yourNum = scanner.next();
            attempts++;
        } while (yourNum.length() != 4 || !yourNum.matches("[0-9]+"));

        while (!randomComp.equals(yourNum)) {
            countBulls = 0;
            countCows = 0;

            for (int i = 0; i < 4; i++) {
                int i1 = getDigit(Integer.parseInt(randomComp), i);
                int i2 = getDigit(Integer.parseInt(yourNum), i);

                if (i1 == i2) {
                    countBulls++;
                }
            }

            for (int i = 0; i < 4; i++) {
                int i1 = getDigit(Integer.parseInt(randomComp), i);

                if (yourNum.contains(String.valueOf(i1)) && getDigit(Integer.parseInt(yourNum), i) != i1) {
                    countCows++;
                }
            }

            System.out.println(countBulls == 0 ? "0 быков " :
                    countBulls == 1 ? "бык" :
                            countBulls + " быка");

            System.out.println(countCows == 0 ? "0 коров" :
                    countCows == 1 ? "1 корова" :
                            countCows + " коровы");

            do {
                System.out.println("Введите число из 4-х цифр: ");
                yourNum = scanner.next();
                attempts++;
            } while (yourNum.length() != 4 || !yourNum.matches("[0-9]+"));
        }

        if (randomComp.equals(yourNum)) {
            System.out.println("Строка угадана с " + attempts + " попытки");
        }
        try {
            // проверяем, существует ли файл results.txt
            File resultsFile = new File("results.txt");
            int gameNumber = 1;
            if (resultsFile.exists()) {
                try (Scanner scanner2 = new Scanner(resultsFile)) {
                    // считываем последнее значение номера игры
                    while (scanner2.hasNextLine()) {
                        String line = scanner2.nextLine();
                        if (line.startsWith("Game №")) {
                            Pattern pattern = Pattern.compile("\\d+");
                            Matcher matcher = pattern.matcher(line);
                            if (matcher.find()) {
                                gameNumber = Integer.parseInt(matcher.group());
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла: " + e.getMessage());
                }
                gameNumber++; // увеличиваем номер игры на 1
            }

            // записываем результаты в файл
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            String date = dateFormat.format(new Date());
            String time = timeFormat.format(new Date());
            String gameHeader = "Game №" + gameNumber + " " + date + " " + time;
            PrintWriter writer = new PrintWriter(new FileWriter("results.txt", true));
            writer.println(gameHeader);
            writer.println("Загаданная строка: " + randomComp);
            writer.println("Запрос: " + yourNum);
            writer.println("Ответ: " + countBulls + " быков, " + countCows + " коровы");
            if (countBulls == 4) {
                writer.println("Строка была угадана с " + attempts + " попыток");
            }
            writer.println("----------------------------------------");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

    }
}
