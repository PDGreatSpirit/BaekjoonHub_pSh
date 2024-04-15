class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] a = my_string.split("");
        for(String s : a){
            if(s.toUpperCase() != s ){sb.append(s.toUpperCase());}
            else{sb.append(s.toLowerCase());}
        }
        return sb.toString();
    }
}