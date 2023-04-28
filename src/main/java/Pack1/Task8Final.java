package Pack1;

import java.util.Random;
import java.util.Scanner;

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

        do {
            System.out.println("Введите число из 4-х цифр: ");
            yourNum = scanner.next();
        } while (yourNum.length() != 4 || !yourNum.matches("[0-9]+"));

        //   System.out.println(yourNum);

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
    }
}

