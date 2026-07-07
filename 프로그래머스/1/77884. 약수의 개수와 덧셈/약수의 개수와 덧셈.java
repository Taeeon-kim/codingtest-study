class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i = left; left <= right; left++){
           sum += countHandler(left) % 2 == 0 ?  left : -left; 
        }
        return sum;
    }
    private int countHandler(int num){
            int count = 0;
            for(int j = 1; j <= num; j++){
                if(num % j == 0){
                    count++;
                }
            }
        return count;
    }
}