package programming_day;

import java.util.Scanner;

public class Jamboree {

    public static int minTotalSize(int[] sizes, int[] scouts, int index) {
        if (index == sizes.length) {
            int maxTotal = 0;
            for (int scout : scouts) {
                maxTotal = Math.max(maxTotal, scout);
            }
            return maxTotal;
        }

        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < scouts.length; i++) {
            scouts[i] += sizes[index];
            minSize = Math.min(minSize, minTotalSize(sizes, scouts, index + 1));
            scouts[i] -= sizes[index];
        }

        return minSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] sizes = new int[N];
        for (int i = 0; i < N; i++) {
            sizes[i] = scanner.nextInt();
        }

        // initializing scouts array
        int[] scouts = new int[M];

        // calculating and printing the result
        int result = minTotalSize(sizes, scouts, 0);
        System.out.println(result);
    }
}
