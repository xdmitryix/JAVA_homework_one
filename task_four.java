import java.util.Arrays;
import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

public class task_four {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введи уравнение типа q? + ?w = e: ");
        String equation = iScanner.nextLine();
        String[] words = equation.split("=");
        String resultStr = words[1];
        resultStr = resultStr.replaceAll("\\s", "");
        int res = Integer.valueOf(resultStr);
        String numberOneStr = String.valueOf(equation.charAt(0));
        int numberOneInt = Integer.valueOf(numberOneStr) * 10;
        String numberTwoStr = String.valueOf(equation.charAt(6));
        int numberTwoInt = Integer.valueOf(numberTwoStr);
        decision(res, numberOneInt, numberTwoInt);
    }

    public static void decision(int resRight, int numOme, int numTwo) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if ((numOme + i) + ((i*10) + numTwo) == resRight) {
                count++;
                System.out.println((numOme + i) + " + " + ((i*10) + numTwo) + " = " + resRight);
            }
        }
        if (count == 0) {
            System.out.println("для данного уравнения решения нет.");
            }
    }
}