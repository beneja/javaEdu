package sem2.homework;

import java.util.Scanner;

public class spellСheck {
    public static void main(String[] args) {

        String test = "   Добрый   день Как дела   Все хорошо";
        System.out.println(test + " -> " + spellingСorrection(test));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println(spellingСorrection(str));
    }

    public static String spellingСorrection(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.replaceAll("\\s{1,}([А-ЯЁ])", ". $1");
        char point = '.';
        if (str.charAt(str.length() - 1) != point) {
            str += point;
        }
        return str;
    }
}

