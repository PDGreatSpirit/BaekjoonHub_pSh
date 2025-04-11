import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        int i = 0;

        while (i < M - 2) {
            if (S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                int patternCount = 0;
                while (i + 2 < M && S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                    patternCount++;
                    i += 2;
                }
                if (patternCount >= N) {
                    count += (patternCount - N + 1);
                }
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}