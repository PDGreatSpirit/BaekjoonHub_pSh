import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] s = cipher.split("");
        for(int i = code-1; i < cipher.length(); i+=code){
            sb.append(s[i]);
        }
        return sb.toString();
    }
}