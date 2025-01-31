import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon s®rc="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]);
        int w = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        int y = Integer.parseInt(arr[3]);

        // 2차원 배열 초기화
        int[][] array = new int[h+x][];
        int[][] answer = new int[h][w];

        // 각 행의 데이터 입력
        for (int i = 0; i < h+x; i++) {
            array[i] = Arrays.stream(br.readLine().split(" ")) // 공백으로 분리
                    .mapToInt(Integer::parseInt) // 정수로 변환
                    .toArray(); // 배열로 저장
        }
        for(int i =0; i< h+x; i++) {
            for(int j =0; j< w+y; j++) {
                if(i<x && j< w) {// 위쪽 설치
                    answer[i][j] = array[i][j];
                }else if(j<y && i<h) { // 왼쪽 설치 
                    answer[i][j] = array[i][j];
                }else if(j>=y && i>=x  && j< w && i<h) {//겹치는 거
                    answer[i][j] = array[i][j]-answer[i-x][j-y];
                }
            }
        }

        Arrays.stream(answer)
                .forEach(ints -> {
                    for(int i : ints){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                });


    }
}
