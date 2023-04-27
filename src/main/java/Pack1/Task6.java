package Pack1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите предложение: ");
        String str = scanner.nextLine();

        if (str.contains("тестер")) {
            System.out.println(str.replaceAll("тестер", "разраб"));
        } else {
            System.out.println(str);
        }
    }
}
