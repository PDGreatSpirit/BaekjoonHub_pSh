import java.io.*;
import java.util.*;


class Solution {
    static boolean solution(String s) {
        s = s.toLowerCase();
        int p=0;
        int y=0;
        String[] st1  =s .split("");
        for (String st : st1){
            if(st.equals("p")) p++;
            if(st.equals("y")) y++;
        }

        return p == y;
    }
}