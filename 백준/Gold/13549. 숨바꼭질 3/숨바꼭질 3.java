import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        System.out.println(findShortestTime(N, K));
    }

    private static int findShortestTime(int N, int K) {
        if (N >= K) {
            return N - K;
        }

        final int MAX = 100000;
        int[] time = new int[MAX + 1];
        for (int i = 0; i <= MAX; i++) {
            time[i] = Integer.MAX_VALUE;
        }
        time[N] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 순간이동 경우 (0초 소요)
            if (current * 2 <= MAX && time[current * 2] > time[current]) {
                time[current * 2] = time[current];
                queue.offer(current * 2);
            }

            // 걸어서 이동하는 경우 (1초 소요)
            if (current + 1 <= MAX && time[current + 1] > time[current] + 1) {
                time[current + 1] = time[current] + 1;
                queue.offer(current + 1);
            }
            if (current - 1 >= 0 && time[current - 1] > time[current] + 1) {
                time[current - 1] = time[current] + 1;
                queue.offer(current - 1);
            }
        }

        return time[K];
    }
}
