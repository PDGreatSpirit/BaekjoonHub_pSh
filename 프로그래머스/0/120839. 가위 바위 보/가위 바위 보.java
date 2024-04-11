import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            if(a.equals("2")) sb.append("0");
            if(a.equals("0")) sb.append("5");
            if(a.equals("5")) sb.append("2");
            
        }
        return sb.toString();
    }
}