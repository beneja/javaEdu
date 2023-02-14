package sem1.homework;

import java.util.Scanner;

public class calc {
    static int solve(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> System.out.println("Ошибка");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = Integer.parseInt(scanner.next());
        System.out.println("Введите операцию: ");
        char op = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num2 = Integer.parseInt(scanner.next());
        System.out.printf(num1 + " " + op + " " + num2 + " = " + solve(num1, num2, op));
    }
}
