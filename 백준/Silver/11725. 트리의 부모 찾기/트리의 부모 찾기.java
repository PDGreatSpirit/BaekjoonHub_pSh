import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {

    static int[] parents;
    static ArrayList<Integer>[] arr;

    static boolean[] isVisit;



    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parents= new int[n+1];
        arr = new ArrayList[n+1];
        isVisit = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            arr[x].add(y);
            arr[y].add(x);
        }
        dfs(1);
        for (int i = 2; i < parents.length; i++) {
            System.out.println(parents[i]);
        }
    }
    public static void dfs(int n){
        isVisit[n] = true;
        for(int i : arr[n]){
            if(!isVisit[i]){
                parents[i] = n;
                dfs(i);
            }
        }
    }
}