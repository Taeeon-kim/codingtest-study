class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int digit = x;
        
        do{
            sum += digit % 10;
            digit = digit/10;
        }while(digit > 0);
      
        return x % sum == 0 ? true : false;
        
    }
}