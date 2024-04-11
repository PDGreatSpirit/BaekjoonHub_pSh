class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        int all=0;
        for(int n : numbers){
            all+=n;
        }
        answer = (double)all/(double)size;
        return answer;
    }
}