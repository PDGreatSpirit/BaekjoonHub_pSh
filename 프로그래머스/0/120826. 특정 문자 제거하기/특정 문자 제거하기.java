import java.util.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        String[] arr = a.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length; i++){
            if(!arr[i].equals(b)){
                sb.append(arr[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}