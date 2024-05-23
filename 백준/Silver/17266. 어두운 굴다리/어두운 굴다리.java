import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 굴다리의 길이
        int M = scanner.nextInt(); // 가로등의 개수
        int[] positions = new int[M];
        
        for (int i = 0; i < M; i++) {
            positions[i] = scanner.nextInt(); // 각 가로등의 위치
        }

        int left = 1;
        int right = N;
        int result = N;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canIlluminateAll(mid, N, positions)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(result);
        scanner.close();
    }

    private static boolean canIlluminateAll(int height, int N, int[] positions) {
        // 첫 가로등이 시작하는 위치를 커버할 수 있는지 확인
        if (positions[0] - height > 0) {
            return false;
        }
        // 모든 가로등이 커버하는 구간이 연속적인지 확인
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] - height > positions[i - 1] + height) {
                return false;
            }
        }
        // 마지막 가로등이 끝나는 위치를 커버할 수 있는지 확인
        if (positions[positions.length - 1] + height < N) {
            return false;
        }
        return true;
    }
}
