import java.util.ArrayList;
class Solution {
    public int[] solution(long n) {

        int size = String.valueOf(n).length();
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++){
            answer[i] = (int) (n % 10);
         
            n = n / 10;
        }
    
        return answer;
    }
}