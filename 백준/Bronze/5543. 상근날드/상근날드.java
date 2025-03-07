import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Math.min( Integer.parseInt(br.readLine()) , Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()) ));
        int y = Math.min(Integer.parseInt(br.readLine()) , Integer.parseInt(br.readLine()));
        System.out.println(x+y -50);

    }
}

