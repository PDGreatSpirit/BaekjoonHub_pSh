import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    static char[][] arr;
    static int[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] c =br.readLine().split(" ");
        int x = Integer.parseInt(c[0]);
        int y = Integer.parseInt(c[1]);
        int loc[] = new int[2];
        arr = new char[x][y];
        visited = new int[x][y];
        for (int i = 0; i < x; i++) {
            char[] asda = br.readLine().toCharArray();
            for (int j = 0; j < y; j++) {
                arr[i][j] = asda[j];
                if (arr[i][j] == 'I') {
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        int ns = bfs(loc[0] , loc[1]);
        if(ns == 0) System.out.println("TT");
        else System.out.println(ns);

    }
    public static int bfs(int x , int y){
        class Node{
            int x;
            int y;
            Node(int x ,int y){
                this.x=x;
                this.y=y;
            }
        }
        int n = arr.length;
        int m = arr[0].length;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(x,y));
        int answer = 0;
        while (!stack.isEmpty()){
            Node node = stack.pop();
            visited[node.x][node.y] = 1;
            for (int i = 0; i < 4; i++) {
                int x1 =node.x + dx[i];
                int y1 =node.y + dy[i];
                if (x1 != -1 && y1 != -1 && x1 != n && y1 != m && visited[x1][y1] == 0 && arr[x1][y1] != 'X'){

                    stack.push(new Node(x1,y1));
                    visited[x1][y1] = 1;
                     if(arr[x1][y1] =='P') answer++;
                }
            }
        }
        return answer;
    }
}

