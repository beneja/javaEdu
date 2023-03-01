package sem5.homework;

import java.util.HashMap;

public class subarrays {
    static void findRepeating(int[] num1, int[] num2) {
        HashMap<Integer, Boolean> repeating = new HashMap<>();
        for (int item : num1) {
            repeating.put(item, false);
        }
        int count = 0;
        for (int item : num2) {
            if (repeating.containsKey(item)) {

                count++;
            }
        }
        System.out.println((count));
    }

    public static void main(String[] args) {

        findRepeating(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7});
        findRepeating(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0});
    }
}
