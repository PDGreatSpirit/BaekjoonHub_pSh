import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            for(int j =0 ; j < n ; j++){
                sb.append(arr[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}