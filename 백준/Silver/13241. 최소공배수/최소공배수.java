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
        Long x = Long.parseLong(arr[0]);
        Long y = Long.parseLong(arr[1]);
        if ( x > y ) {
            Long temp = x;
            x = y;
            y = temp;
        }
        if(y%x == 0){
            System.out.println(y);
            return;
        }
        Long a = x;
        Long b = y;

        while(b%a != 0){
            Long temp = a;
            a = b%a;
            b = temp;
        }

        System.out.println((x*y)/a);
    }
}

