package dynamic;

import java.util.Scanner;

public class Zoo {
    private static final int MOD = 9901;
    private static final int MAX = 100000;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] d = new long[MAX+1][3];


        d[1][0] = 1;
        d[1][1] = 1;
        d[1][2] = 1;

        for (int i = 2; i <= MAX; i++) {
            d[i][0] = d[i-1][1] + d[i-1][2] + d[i-1][0];
            d[i][1] = d[i-1][0] + d[i-1][2];
            d[i][2] = d[i-1][0] + d[i-1][1];

            d[i][0] %= MOD;
            d[i][1] %= MOD;
            d[i][2] %= MOD;
        }

        System.out.println((d[n][0] + d[n][1] + d[n][2])%MOD);
    }
}
