import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int an = 0 ;
        int max = -1;
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());
            max = an;
            an += x;
            if ( an >= 100) {
                if(an - 100  > 100 -max ) an = max;
                break;
            }
        }
        System.out.println(an);
    }
}

