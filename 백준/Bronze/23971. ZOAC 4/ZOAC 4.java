import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]);
        int w = Integer.parseInt(arr[1]);
        int n = Integer.parseInt(arr[2]);
        int m = Integer.parseInt(arr[3]);
        int x = (h + n) / (n + 1);
        int y = (w + m) / (m + 1);
        System.out.println(x * y);
    }
}
