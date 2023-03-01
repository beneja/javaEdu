package sem4.homework;

import java.util.*;


public class phonebook {

    static void findLogin(HashMap<String, HashSet<Integer>> phonebook) {
        System.out.println("Поиск: ");
        Scanner sn = new Scanner(System.in);
        String find = sn.nextLine();
        Set<Integer> value = phonebook.get(find);
        System.out.println(value);

    }

    static void addLogin(HashMap<String, HashSet<Integer>> phonebook) {
        System.out.println("Введите имя: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        HashSet<Integer> numbers = new HashSet<>();
        phonebook.put(name, numbers);
    }

    static void addPhone(HashMap<String, HashSet<Integer>> phonebook) {

        System.out.println(phonebook.keySet());
        System.out.println("Выберите контакт, к которому хотите добавить номер:");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        System.out.println("Введите номер: ");
        Scanner sn1 = new Scanner(System.in);
        int number = sn1.nextInt();
        phonebook.get(name).add(number);

    }

    static void delNumber(HashMap<String, HashSet<Integer>> phonebook) {
        System.out.println("Контакт для удаления: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        phonebook.remove(name);

    }


    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> phonebook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String choice = "";

        while (!"5".equals(choice)) {
            System.out.println("Введите номер операции для выбора действия: \n" +
                    "1. Добавить контакт\n" +
                    "2. Добавить телефон\n" +
                    "3. Найти телефон\n" +
                    "4. Удалить контакт\n" +
                    "5. Выход");

            choice = scan.next();

            try {
                x = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (x) {
                case 1 -> addLogin(phonebook);
                case 2 -> addPhone((phonebook));
                case 3 -> findLogin(phonebook);
                case 4 -> delNumber(phonebook);
            }
        }
    }
}

