import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int[] a = new int[3];
            int[] b = new int[3];
            for (int j = 0; j < 3; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < 3; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }
            int z = b[2] - a[2];
            int x = b[0] - a[0];
            int y = b[1] - a[1];
            if ( z <0){
                y--;
                z=60 + z;
            }

            if ( y < 0){
                x--;
                y=60 + y;
            }


            System.out.print(x+" ");
            System.out.print(y+" ");
            System.out.print(z);
            System.out.println( );


        }

    }
}

