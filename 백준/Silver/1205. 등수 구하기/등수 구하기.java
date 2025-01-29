import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] ranking = new int[p];

        if(n ==0) {
            System.out.println("1");
            return;
        }
        else
        {
            st = new StringTokenizer(bf.readLine());
        }

        for (int i = 0; i < n; i++) {
            ranking[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(ranking);
        if((p==n) && (ranking[0]>=x)){

            System.out.println(-1);
            return;
        }

        int cnt = 1;
        for(int i=p-1;i>=Math.max(0,p-n-1);i--){
            if(ranking[i]>x) cnt++;
            else break;
        }
        System.out.println(cnt);

    }
}
