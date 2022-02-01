package dynamic;

import java.util.Scanner;

public class MakeOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] D = new int[n+1];

        int result = getMakeOneWaysByRecursive(n, D);

        System.out.println(result);
    }

    private static int getMakeOneWaysByRecursive(int n, int[] D) {

        if ( n == 1 ) {
            return 0;
        }

        if (D[n] > 0) {
            return D[n];
        }

        D[n] = getMakeOneWaysByRecursive(n-1, D) +1;

        if (n%2 == 0) {
            int tmp = getMakeOneWaysByRecursive(n/2, D) +1;
            if (tmp < D[n]) {
                D[n] = tmp;
            }
        }

        if (n%3 == 0) {
            int tmp = getMakeOneWaysByRecursive(n/3, D) +1;
            if (tmp < D[n]) {
                D[n] = tmp;
            }        }
        return D[n];
    }
}
