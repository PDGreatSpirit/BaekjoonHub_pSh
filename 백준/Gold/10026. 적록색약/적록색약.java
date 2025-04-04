import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n  = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        char[][] arr2 = new char[n][n];
        for (int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s[j];
                if(s[j] != 'B' ) arr2[i][j] = 'R';
                else arr2[i][j] = s[j];
            }
        }
        System.out.print(dfs(arr)+" ");
        System.out.println(dfs(arr2));
    }

    private static int dfs(char[][] arr) {
        class Node{
            int x;
            int y;
            char str;
            Node(int x , int y , char str){
                this.x = x;
                this.y = y;
                this.str = str;
            }

        }
        int answer = 0;
        int[] dx= {0,0,1,-1};
        int[] dy ={1,-1,0,0};
        int[][] visited = new int[n][n];
        Queue<Node> q  = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( visited[i][j] ==0){
                    q.add(new Node(i,j,arr[i][j]));
                    visited[i][j] = 1;
                    answer ++;
                }else continue;

                while (!q.isEmpty()) {
                    Node node = q.poll();
                    for (int k = 0; k < 4; k++) {
                        if (node.x + dx[k] != -1 && node.y + dy[k] != -1 && node.x + dx[k] != n
                                && node.y + dy[k] != n && node.str == (arr[node.x+dx[k]][node.y+dy[k]]) && visited[node.x+dx[k]][node.y+dy[k]] == 0) {
                            q.add(new Node(node.x + dx[k], node.y + dy[k] , node.str));
                            visited[node.x+dx[k]][node.y+dy[k]] = 1;

                        }
                    }
                }
            }


        }
        return answer;
    }
}

