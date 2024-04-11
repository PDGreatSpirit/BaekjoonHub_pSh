class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp%5 == 0) return hp/5;
        int a = hp%5;
        int x = hp/5;
        hp = hp-(x*5);
        answer = x;
        if(hp == 3 || hp ==1) answer +=1;
        if(hp == 4 || hp ==2) answer +=2;
        return answer;
    }
}