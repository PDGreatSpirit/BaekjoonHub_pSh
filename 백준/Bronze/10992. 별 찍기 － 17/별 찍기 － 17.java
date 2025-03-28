import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int a = x-1;
        int b = x-1;
        for (int i = 0; i < x-1; i++) {
            for (int j = 0; j < (2*x) -1; j++) {
                if(j == a || j ==b) System.out.print("*");
                else if ( j < b) System.out.print(" ");
            }
            a--;
            b++;
            System.out.println();
        }
        for (int i = 0; i < (2 * x) - 1; i++) {
            System.out.print("*");
        }

    }
}

