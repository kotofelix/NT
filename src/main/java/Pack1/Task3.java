package Pack1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        int myAge = scanner.nextInt();

        if (myAge < 12) {
            System.out.println("Я ребёнок");
        } else if (myAge < 18) {
            System.out.println("Я подросток");
        } else if (myAge < 60) {
            System.out.println("Я взрослый");
        } else {
            System.out.println("Я дед");
        }
    }
}
