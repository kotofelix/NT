package Pack1;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int diff = max - min;

        Random random = new Random();
        int rand = random.nextInt(diff + 1) + min;
        System.out.println("Угадай заданное мной число, введи число от 1 до 100: ");
        int yourNum = scanner.nextInt();
        if (yourNum > rand && yourNum < 100) {
            System.out.println("Твоё число больше моего");
        } else if (yourNum < rand && yourNum >= 1) {
            System.out.println("Твоё число меньше моего");
        } else if (yourNum == rand) {
            System.out.println("Вот так счастливчик - Угадал!");
        } else
            System.out.println("Число выходит за диапазон");
    }
}
