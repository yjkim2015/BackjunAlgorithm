package math;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class GcdSum {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(sc.nextLine());


        while (n-- > 0) {
            int num = sc.nextInt();

            int line[] = new int[num];
            for (int i = 0; i < num; i++){
                line[i] = sc.nextInt();
            }

            int count = 0;
            for (int j = 0; j < line.length-1; j++) {
                for (int k = j+1; k < line.length; k++) {
                    count+=getGcd(line[j], line[k]);
                }
            }
            bw.write(count+"\n");
        }


        bw.flush();
    }

    public static int getGcd(int a, int b) {

        if (b == 0){
            return a;
        }
        else {
            return getGcd(b, a % b);
        }
    }
}
