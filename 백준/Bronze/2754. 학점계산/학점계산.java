import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

//어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
//
// A+: 4.3, A0: 4.0, A-: 3.7
//
//B+: 3.3, B0: 3.0, B-: 2.7
//
//C+: 2.3, C0: 2.0, C-: 1.7
//
//D+: 1.3, D0: 1.0, D-: 0.7
//
//F: 0.0
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.equals("A+"))
            System.out.println("4.3");
        if (str.equals("A0"))
            System.out.println("4.0");
        if (str.equals("A-"))
            System.out.println("3.7");
        if (str.equals("B+"))
            System.out.println("3.3");
        if (str.equals("B0"))
            System.out.println("3.0");
        if (str.equals("B-"))
            System.out.println("2.7");
        if (str.equals("C+"))
            System.out.println("2.3");
        if (str.equals("C0"))
            System.out.println("2.0");
        if (str.equals("C-"))
            System.out.println("1.7");
        if (str.equals("D+"))
            System.out.println("1.3");
        if (str.equals("D0"))
            System.out.println("1.0");
        if (str.equals("D-"))
            System.out.println("0.7");
        if (str.equals("F"))
            System.out.println("0.0");
    }
}