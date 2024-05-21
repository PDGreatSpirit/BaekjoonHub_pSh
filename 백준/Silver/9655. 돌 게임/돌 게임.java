import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // DP 배열 초기화
        String[] dp = new String[N + 1];

        // 초기 값 설정
        dp[0] = "CY"; // 돌이 0개 남았을 때, 창영이가 이기므로 CY
        dp[1] = "SK"; // 돌이 1개 남았을 때, 상근이가 이기므로 SK
        
        // DP 배열 채우기
        for (int i = 2; i <= N; i++) {
            if (i - 1 >= 0 && dp[i - 1].equals("CY")) {
                dp[i] = "SK";
            } else if (i - 3 >= 0 && dp[i - 3].equals("CY")) {
                dp[i] = "SK";
            } else {
                dp[i] = "CY";
            }
        }

        // 결과 출력
        System.out.println(dp[N]);
    }
}
