package bruteforce;

import java.util.Scanner;

public class DateCalculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int e1 = sc.nextInt();
        int s1 = sc.nextInt();
        int m1 = sc.nextInt();

        int e2 = 1;
        int s2 = 1;
        int m2 = 1;

        int count = 1;

        while (true) {
            if (e1 == e2 && s1 == s2 && m1 == m2) {
                System.out.println(count);
                break;
            }

            e2++;
            s2++;
            m2++;
            count++;

            if (e2 > 15) {
                e2 = 1;
            }
            if (s2 > 28) {
                s2 = 1;
            }
            if (m2 > 19) {
                m2 = 1;
            }
        }

    }
}
