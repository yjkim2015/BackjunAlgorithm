package dynamic;

import java.util.Scanner;

public class EasyStairs {

    public static final long MOD = 1000000000;

    public static long[][] stairs;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long result = 0;
        stairs = new long[n+1][10];

        for (int i = 1; i <=9; i++) {
            stairs[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 0; j <= 9; j++) {
                if (j-1 >= 0) {
                    stairs[i][j] += stairs[i-1][j-1];
                }

                if (j+1 <= 9) {
                    stairs[i][j] += stairs[i-1][j+1];
                }
                stairs[i][j] %= MOD;
            }
        }

        for (int i = 0; i <= 9; i++) {
            result += stairs[n][i];
        }
        System.out.println(result%MOD);
    }
}
