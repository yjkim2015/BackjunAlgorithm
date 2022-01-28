package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephuse {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] lines = sc.nextLine().split(" ");

        int n = Integer.parseInt(lines[0]);
        int k = Integer.parseInt(lines[1]);

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            queue.add(i+1);
        }


        while (!queue.isEmpty()) {
            count++;
            if (count % k != 0) {
                queue.add(queue.poll());
            }
            else {
                result.add(queue.poll());
                count = 0;
            }

        }

        System.out.println(result);
    }
}
