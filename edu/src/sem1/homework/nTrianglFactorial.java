package sem1.homework;

import java.util.Scanner;

public class nTrianglFactorial {    //Вычислить n-ое треугольное число(сумма чисел от 1 до n),
    // n! (произведение чисел от 1 до n)
    static int trianglNumber(int n) {
        if (n == 1) return 1;
        return n + trianglNumber(n - 1);
    }

    static int factorialNumber(int n) {
        if (n == 1) return 1;
        return n * factorialNumber(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.next());
        System.out.println("Трейгольное число: " + trianglNumber(number));
        System.out.println("Факториал " + number + " = " + factorialNumber(number));
    }
}
