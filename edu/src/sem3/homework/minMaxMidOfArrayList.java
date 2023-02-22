package sem3.homework;

import java.util.ArrayList;
import java.util.Random;

public class minMaxMidOfArrayList {
    static Integer getMin(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int item : array) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    static Integer getMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int item : array) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    static Integer getMid(ArrayList<Integer> array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum / array.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomList.add(random.nextInt(0, 100));
        }
        System.out.println(randomList);
        System.out.println("минимальное значение: " + getMin(randomList));
        System.out.println("максимальное значение: " + getMax(randomList));
        System.out.println("среднее арифметическое значение: " + getMid(randomList));
    }
}
