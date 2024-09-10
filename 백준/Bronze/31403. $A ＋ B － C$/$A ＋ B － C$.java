import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int x = in.nextInt();
        sb.append(x);
        int y = in.nextInt();
        sb.append(y);
        int z = in.nextInt();
        int a =Integer.parseInt(sb.toString())-z;
        System.out.println(x+y-z);
        System.out.println(a);

    }
}