import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer , String> map  = new HashMap<>();
        int n = Integer.parseInt(br.readLine());;
        int num = 1;
        while (true){
            if(n==0) break;
            int[] arr = new int[n+1];
            for (int i = 1; i <= n; i++) {
                map.put(i , br.readLine());
            }
            while(true){
                int i=0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                if(st.countTokens() ==1) {
                    n = Integer.parseInt(st.nextToken());
                    break;
                }
                    int x = Integer.parseInt(st.nextToken());
                    arr[x]++;

            }
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] != 2 ) System.out.println(num++ +" " + map.get(i));
            }

        }

    }
}