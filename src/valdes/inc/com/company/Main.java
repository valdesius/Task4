package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = readNumber();
// calculateEvenAndOddSumInNumber(a);
        int b = readNumber();
        int c = readNumber();
        calculateFromAToB(a, b , c);
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

    private static void calculateEvenAndOddSumInNumber(int number) {
        int a = number;
        int even = 0;
        int odd = 0;
        for (int i = 1; a / i > 0; i *= 10) {
            if ((a / i) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Четных чисел: " + even + " Нечетных чисел: " + odd);

        if (even == odd) {
            System.out.println("Число походит под условие задачи!");
        } else {
            System.out.println("Число не походит под условие задачи...");
        }
    }

    private static int calculateFromAToB(int numberA, int numberB, int number){

        int sum = 0;
        for(int m = numberA; m <= numberA; m++){
            int a = number;
            int even = 0;
            int odd = 0;
            for (int i = 1; a / i > 0; i *= 10) {
                if ((a / i) % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println("Четных чисел: " + even + " Нечетных чисел: " + odd);

            if (even == odd) {
                System.out.println("Число походит под условие задачи!");
            } else {
                System.out.println("Число не походит под условие задачи...");
            }


            sum += m;

        }


        System.out.print(sum);
        return sum;
    }

}