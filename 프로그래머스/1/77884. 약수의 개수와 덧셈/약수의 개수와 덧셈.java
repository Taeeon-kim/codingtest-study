class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i = left; left <= right; left++){
            int count = 0;
            for(int j = 1; j <= left; j++){
                if(left % j == 0){
                    count++;
                }
            }
           sum += (count % 2) == 0 ?  left : -left; 
        }
        return sum;
    }
}