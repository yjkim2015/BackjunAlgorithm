package dynamic;

import java.util.Scanner;

public class TilingByTwon {

    public static int[] D;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        D = new int[n+1];

        System.out.println(tiling(n));
    }

    public static int tiling(int n) {

        if (n < 3 ){
           return n;
        }

        if (D[n]> 0) {
            return D[n];
        }

        D[n] = tiling(  n-1) + tiling(n-2);

        return D[n] % 10007;
    }
}
