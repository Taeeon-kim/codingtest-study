import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String strNumber = String.valueOf(n);
        for(char ch : strNumber.toCharArray()){
            
            answer += ch - '0';
        }

        return answer;
    }
}