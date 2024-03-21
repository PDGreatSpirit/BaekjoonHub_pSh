import java.io.*;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb  = new StringBuilder();
        while (x-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String n = st.nextToken();
            switch (n){
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!queue.isEmpty()) sb.append(queue.remove()).append("\n");
                    else {
                        sb.append(-1+"\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1+"\n");
                    else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                    else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "back":
                    if(!queue.isEmpty()) sb.append(queue.peekLast()).append("\n");
                    else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }

}
