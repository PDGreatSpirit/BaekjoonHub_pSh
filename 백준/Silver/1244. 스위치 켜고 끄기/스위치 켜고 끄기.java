import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer( br.readLine()  , " ");
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        int  m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int gender= Integer.parseInt(st2.nextToken());
            int loc = Integer.parseInt(st2.nextToken());
            int loc2 = loc-1;
            switch(gender) {
                case 1:
                    while (loc2 < n){
                        arr[loc2]= switchOnOff(arr[loc2]);
                        loc2 += loc;
                    }
                    break;
                case 2:
                    int weight = 0;
                    while ((loc2 + weight) < n && (loc2 - weight)> -1) {
                        if (arr[loc2 - weight] != arr[loc2 + weight]){
                            break;
                        }
                        weight++;
                    }

                    while (weight-- > 0){
                        if(weight==0) arr[loc2] = switchOnOff(arr[loc2]);
                        arr[loc2-weight] = switchOnOff(arr[loc2 - weight]);
                        arr[loc2+weight] = switchOnOff(arr[loc2 + weight]);
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        int page = 0;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
            if(++page%20 ==0 ) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static int switchOnOff(int i){
        if(i == 0) return 1;
        else return 0;
    }
}