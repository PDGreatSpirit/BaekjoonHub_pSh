import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr =my_string.split("");
        for(int i = 0; i < arr.length;i++){
            sb.append(arr[arr.length-1-i]);
        }
        String a = sb.toString();
        
        return a;
    }
}