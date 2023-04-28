package Pack1;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String[] strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 слов вашего предложения по отдельности: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        System.out.println("Заполнение массива закончено");

        for (int i = 0; i < 1; i++) {
            System.out.print(strings[i].toUpperCase());
        }
        for (int i = 1; i < strings.length; i++) {
            System.out.print(" " + strings[i]);
        }
    }
}
