package dynamic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OneTwoThree {

    public static int[] D = new int[11];

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        D[0] = 1;
        D[1] = 1;
        D[2] = 2;

        getPlusManners(10);


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            bw.write(D[num]+"\n");
        }

        bw.flush();
    }

    public static int getPlusManners(int n) {

        if (n < 0) {
            return 0;
        }

        if (D[n]> 0) {
            return D[n];
        }

        D[n] = getPlusManners(n-1) + getPlusManners(n-2) + getPlusManners(n-3);

        return D[n];
    }
}
