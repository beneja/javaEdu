package sem1.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class simpleNumbers {

    public static List<Integer> getAllPrimesLessThan(int sieveSize) { //Решето Эрастофена
        var sieve = new boolean[sieveSize];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                for (int j = 2; i * j < sieve.length; j++) {
                    sieve[i * j] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.next());
        System.out.println(getAllPrimesLessThan(number));
    }


}
