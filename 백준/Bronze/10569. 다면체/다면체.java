import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  n= Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x  = Integer.parseInt(st.nextToken());
            int y  = Integer.parseInt(st.nextToken());
            System.out.println(2-x+y);
        }

    }
}

