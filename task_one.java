// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;


public class task_one {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введи число n: ");
        int n = iScanner.nextInt();
        summa(n);
        factorial(n);
    }

    public static void summa (int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("сумма = " + sum);
    }

    public static void factorial (int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("факториал = " + fact);
    }
}