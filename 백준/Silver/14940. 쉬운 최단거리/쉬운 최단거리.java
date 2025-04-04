import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    static int[][] arr;
    static int[][] visited;
    static int s;
    static int e;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] loc = br.readLine().split(" ");
        int x = Integer.parseInt(loc[0]);
        int y = Integer.parseInt(loc[1]);
        s = 0;
        e = 0;
        arr = new int[x][y];
        visited = new int[x][y];
        for (int i = 0; i < x; i++) {
            String[] a = br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                arr[i][j] = Integer.parseInt(a[j]);
                if(Integer.parseInt(a[j]) == 2){
                    s = i;
                    e = j;
                    arr[i][j] = 0;
                }

            }
        }

        bfs( x,y);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <y; j++) {
                if(arr[i][j] == 1 && visited[i][j]==0) System.out.print("-1" + " ");
                else System.out.print(visited[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void bfs(int x , int y){
        class  Node{
            int x;
            int y;
            Node(int x , int y ){
                this.x = x;
                this.y = y;
            }
        }
        Queue<Node> q  = new ArrayDeque<>();
        int[] dx= {0,0,1,-1};
        int[] dy= {1,-1,0,0};

        q.add(new Node(s,e));
        visited[s][e] = 0;
        while (!q.isEmpty()){
            Node node = q.poll();
            for (int i = 0; i < 4; i++) {
                int x1 = node.x + dx[i];
                int y1 = node.y + dy[i];
                if(x1 != -1 && y1 != -1 && x1 != x && y1 != y && visited[x1][y1] == 0 && arr[x1][y1] != 0){
                    q.add(new Node(x1,y1));
                    visited[x1][y1] = visited[node.x][node.y]+1;
                }
            }

        }

    }


}

