import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;
// a 아스키는 97
/* 
 * 
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine() , " ");
        Stack<int[]> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            
        
            int  x = Integer.parseInt(stringTokenizer.nextToken());
            while (true) {
                if(stack.isEmpty()){
                    sb.append(0+" ");
                    break;
                }

                else{
                    if(stack.peek()[0] > x){
                        sb.append(stack.peek()[1]+" ");
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }   
            }
            stack.push(new int[] {x , i});
        }
        System.out.println(sb);
    }
}