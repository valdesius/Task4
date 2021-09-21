package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = inputNumber();
        checkNum(num);
    }

    private static int inputNumber(){
        int number = 0;
        try {
            System.out.print("Введите число с одинаковым количеством четных и нечетных цифр:  ");
            number = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.print("Неверно введенные данные ");
            System.exit(1);
        }

        return number;

    }
    private static void checkNum(int num){
        int n1 = num;
        int n2 = num;
        int n3 = num;
        int n4 = num;
        // проверка для двухзначных чисел
        if (num>9 && num<100) {
            int firstDigit = n1 / 10;
            int secondDigit = n2 % 10;
            System.out.println("");

            if ((firstDigit % 2 == 0 && secondDigit % 2 != 0) || (firstDigit % 2 != 0 && secondDigit % 2 == 0)){
                System.out.println("проходит");

            } else {
                System.out.println("цифры не подходят по усл. ");
            }

        }
        // проверка для четырехзначных
        if (num > 999 && num < 100000){
            // 2631
            int firstDigit = n1 / 1000;
            System.out.println(firstDigit);

            int secondDigit = n2 / 100 % 10;
            System.out.println(secondDigit);

            int thirdDigit = n3 % 100 / 10;
            System.out.println(thirdDigit);

            int fourDigit = n4 % 10;
            System.out.println(fourDigit);

            if (((firstDigit % 2 == 0 && secondDigit % 2 != 0) || (firstDigit % 2 != 0 && secondDigit % 2 == 0)) ||  ((thirdDigit % 2 == 0
                    && fourDigit % 2 != 0) ||  (thirdDigit % 2 != 0 && fourDigit % 2 == 0)) || ((firstDigit % 2 != 0 && secondDigit %2 != 0 &&
                    thirdDigit % 2 == 0 && fourDigit % 2 == 0) || (firstDigit % 2 == 0 && secondDigit % 2 == 0 && thirdDigit %2 != 0 && fourDigit %2 != 0))
            ){
                System.out.println("проходит");
            } else {
                System.out.println("цифры не подходят по усл. ");
            }
        }

    }
}