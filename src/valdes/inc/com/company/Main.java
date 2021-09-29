package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = readNumber();
        int b = readNumber();

        int sum = calculateFromAToB(a, b);
        printSumFromAToB(sum);

    }

    private static int readNumber() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число с одинаковым количеством четных и нечетных цифр: ");
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Неверно введенные данные ");
            System.exit(1);
        }
        return number;
    }

    private static int calculateFromAToB(int numberA, int numberB) {

        int sum = 0;
        for (int m = numberA; m <= numberB; m++) {
            int even = 0;
            int odd = 0;
            for (int i = 1; m / i > 0; i *= 10) {
                if ((m / i) % 2 == 0)
                    even++;
                else
                    odd++;
            }

            if (even == odd) {
                sum += m;
                System.out.println(m);
            } else {
                System.out.println("Пропуск числа");
            }
        }

        return sum;
    }


    private static void printSumFromAToB(int sum) {
        System.out.println("сумма чисел от А до B: " + sum);
    }

}