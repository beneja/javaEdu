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
//        System.out.println("Введите номер: ");
//        Scanner sn1 = new Scanner(System.in);
//        int number = sn1.nextInt();
        HashSet<Integer> numbers = new HashSet<>();
//        numbers.add(number);
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

//        numbers.add(number);
//        phonebook.put(name, numbers);

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

        while (!"4".equals(choice)) {
            System.out.println("Введите номер операции для выбора действия: \n" +
                    "1. Добавить контакт\n" +
                    "2. Найти телефон\n" +
                    "3. Удалить контакт\n" +
                    "4. Выход\n" +
                    "5. Добавить телефон");

            choice = scan.next();

            try {
                x = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (x) {
                case 1 -> addLogin(phonebook);
                case 2 -> findLogin(phonebook);
                case 3 -> delNumber(phonebook);
                case 5 -> addPhone((phonebook));
            }
        }
    }
}

