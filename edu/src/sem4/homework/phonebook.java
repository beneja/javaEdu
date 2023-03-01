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

    static void delLogin(HashMap<String, HashSet<Integer>> phonebook) {
        System.out.println(phonebook.keySet());
        System.out.println("Контакт для удаления: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        phonebook.remove(name);

    }

    static void delPhone(HashMap<String, HashSet<Integer>> phonebook) {
        System.out.println(phonebook.keySet());
        System.out.println("Введите имя контакта: ");
        Scanner sn = new Scanner(System.in);
        String name = sn.nextLine();
        Set<Integer> value = phonebook.get(name);
        System.out.println(value);
        System.out.println("Введите номер, который хотите удалить: ");
        Scanner sn1 = new Scanner(System.in);
        int number = sn1.nextInt();
        phonebook.get(name).remove(number);
        System.out.println("Готово");
    }


    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> phonebook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String choice = "";

        while (!"6".equals(choice)) {
            System.out.println("""
                    Введите номер операции для выбора действия:\s
                    1. Добавить контакт
                    2. Добавить телефон
                    3. Найти телефон
                    4. Удалить контакт
                    5. Удалить телефон
                    6. Выход""");

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
                case 4 -> delLogin(phonebook);
                case 5 -> delPhone(phonebook);
            }
        }
    }
}

