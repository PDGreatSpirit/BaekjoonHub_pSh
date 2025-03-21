import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String p = br.readLine();
        int n  = x.length();
        int m = p.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int sbl = 0;
        while(i != n)
        {
            sb.append(x.charAt(i));
            sbl++;
            if(x.charAt(i++) == p.charAt(m-1)){
                if(sbl < m){
                   continue;
                }
                if(p.equals(sb.substring(sbl-m,sbl))){
                    sb.delete(sbl-m,sbl);
                    sbl -= m;
                }
            }

        }
        if( sbl == 0){
            System.out.println("FRULA");
        }
        System.out.println(sb.toString());
    }
}

