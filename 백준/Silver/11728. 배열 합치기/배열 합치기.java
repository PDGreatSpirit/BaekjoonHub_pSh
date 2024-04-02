import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int  n = Integer.parseInt(st.nextToken());
        int  m = Integer.parseInt(st.nextToken());
        int[] arrN  = new int[n+m];
        StringTokenizer stN = new StringTokenizer(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(stN.nextToken());
        }
        for (int i = n; i < n+m; i++) {
            arrN[i] = Integer.parseInt(stM.nextToken());
        }
        Arrays.sort(arrN);
        StringBuilder sb = new StringBuilder();
        for (int j : arrN) {
            sb.append(j).append(" ");
        }
        System.out.println(sb.toString());
    }
}