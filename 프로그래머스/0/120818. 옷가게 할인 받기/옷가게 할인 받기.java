class Solution {
    public int solution(int price) {
        double p = price;
        if(p >= 500000 ) {
            p = price*0.8;
            int anwswer = (int)p;
            return anwswer;
        }
        if(p >= 300000 ) {
            p = price*0.9;
            int anwswer = (int)p;
            return anwswer;
        }
        if(p >= 100000 ) {
            p = price*0.95;
            int anwswer = (int)p;
            return anwswer;
        }
        
            int anwswer = (int)p;
            return anwswer;
        
    }
}