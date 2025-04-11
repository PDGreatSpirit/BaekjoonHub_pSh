import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int map[][] = new int[n][n];
        int visted[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(map , visted , n);

    }
    public static void bfs(int map[][] , int visted[][], int n ){
        class Node{
            int x;
            int y;
            Node(int x , int y){
                this.x = x ;
                this.y  = y;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if(map[i][j] == 1 && visted[i][j] == 0)  {
                    Queue<Node> q = new ArrayDeque<>();
                    q.add(new Node(i,j));
                    visted[i][j] = 1;
                    int[] dx = {0,0,1,-1};
                    int[] dy = {1,-1,0,0};
                    count++;
                    while (!q.isEmpty()) {
                        Node node = q.poll();

                        for (int k = 0;k < 4; k++) {
                            int x1 = node.x + dx[k];
                            int y1 = node.y + dy[k];
                            if (x1 > -1 && y1 > -1 && x1 < n && y1 < n && visted[x1][y1] == 0 && map[x1][y1] == 1) {
                                q.add(new Node(x1, y1));
                                visted[x1][y1] = 1;
                                count++;
                            }
                        }
                    }

                    list.add(count);
                }

            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        list.forEach(System.out::println);


    }
}

