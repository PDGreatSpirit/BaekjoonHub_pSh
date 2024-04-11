class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        for(String s : arr){
            if(s.equals("a")) continue;
                        if(s.equals("e")) continue;

                        if(s.equals("i")) continue;

                        if(s.equals("o")) continue;

                        if(s.equals("u")) continue;

            
            sb.append(s);
        }
        return sb.toString();
    }
}