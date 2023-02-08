/**
 * Innerprogram
 */
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        String s = "nullllll";
        System.out.println(s);

        short age = 10;
        int salary = 1234456;
        System.out.println(age);
        System.out.println(salary);
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        
        var i = 123;
        System.out.println(getType(i));
        int a = 123;
        a = a-- - --a;
        System.out.println(a);
        boolean g = 213 <= 123;
        System.out.println(g);


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int j = iScanner.nextInt();
        System.out.println(j);
        iScanner.close();
        
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
