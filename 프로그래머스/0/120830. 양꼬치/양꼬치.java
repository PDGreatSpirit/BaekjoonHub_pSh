class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int x = n/10;
        answer = n * 12000;
        answer += (k-x)*2000;
        return answer;
    }
}