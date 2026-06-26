class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int digit = x;
        for(int i = 0; i < String.valueOf(x).length(); i++){
            sum += digit % 10;
            digit = digit/10;
        }
        if(x % sum == 0){
            return true;
        }
        return false;
    }
}