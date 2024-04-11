class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = money / 5500;
        int m = money-(cup*5500);
        answer[0] = cup;
        answer[1] = m;
        return answer;
    }
}