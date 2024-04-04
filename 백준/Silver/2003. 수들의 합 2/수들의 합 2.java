import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int answer = 0;
        int M = Integer.parseInt(st.nextToken());
        StringTokenizer st2  = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            int i1 = Integer.parseInt(st2.nextToken());
            arr[i] = i1;
        }
        if(arr.length == 1) {
            if(arr[0] == M) System.out.println(1);
            else System.out.println(0);
            return;
        }
        if(arr[0] == M) answer++;
        int pointA =0;
        int pointB =2;
        while (pointA  < arr.length){
            int plus = 0;
            if(arr.length < pointB) pointB = arr.length;
            for(int i = pointA ; i < pointB; i++){
                plus +=arr[i];
            }
            if(plus < M && arr.length == pointB) break;
            if(plus < M) pointB++;
            if(plus > M) pointA++;
            if(plus == M){
                answer++;
                if(pointB != arr.length) pointB++;
                else pointA++;
            }
            }
        System.out.println(answer);
    }
}