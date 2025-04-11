import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int dist[][] = new int[n+1][n+1];

        for (int i = 1; i < dist.length; i++) {
            for (int j = 1; j < dist.length; j++) {
                if (i == j) dist[i][j] =  0;
                else dist[i][j] = 5000100;
            }
        }

        while(m-- > 0 ){
            String arr2[] = br.readLine().split(" ");
            int x = Integer.parseInt(arr2[0]);
            int y = Integer.parseInt(arr2[1]);
            dist[x][y] = dist[y][x] = 1;

        }
        for (int k = 1; k < n+1; k++) {
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        int max = Integer.MAX_VALUE;
        int man = 0;
        for (int i = 1; i < n+1; i++) {
            int count = 0;
            for (int j = 1; j < n+1; j++) {
                if(dist[i][j] != 5000100) count += dist[i][j];
            }
            if(max > count) {
                max = count;
                man = i;
            }

        }
        System.out.println(man);



    }
}

