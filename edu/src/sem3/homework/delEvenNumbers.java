package sem3.homework;

import java.util.ArrayList;
import java.util.Random;

public class delEvenNumbers {
    static ArrayList<Integer> delEven(ArrayList<Integer> array) {
        ArrayList<Integer> withoutEvenNumbers = new ArrayList<>();
        for (int item : array) {
            if (!(item % 2 == 0)) {
                withoutEvenNumbers.add(item);
            }
        }
        return withoutEvenNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomList.add(random.nextInt(0, 100));
        }
        System.out.println(randomList);
        System.out.println(delEven(randomList));
    }
}
