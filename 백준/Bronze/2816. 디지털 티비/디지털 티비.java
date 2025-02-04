import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int kbs1 = 0;
        int kbs2 = 0;
        for (int i = 1; i < n+1; i++) {
            String x = br.readLine();
            if(x.equals("KBS1")) kbs1 = i ;
            if(x.equals("KBS2")) kbs2 = i ;

        }
        for (int i = 1; i <kbs1; i++) {
            System.out.print(1);
        }
        for (int i = 1; i <kbs1; i++) {
            System.out.print(4);
        }
        if(kbs2 < kbs1) kbs2 += 1;
        for (int i = 1; i <kbs2; i++) {
            System.out.print(1);
        }
        for (int i = 1; i <kbs2-1; i++) {
            System.out.print(4);
        }
    }
}

