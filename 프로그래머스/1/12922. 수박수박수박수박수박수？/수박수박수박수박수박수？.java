class Solution {
    public String solution(int n) {
        String melon = "수박";
        String result = "";
        
        for(int i=0; i < n / 2; i++){
            result += melon;
        }
        
        if(n % 2 != 0){
            result+= "수";
        }
        
        return result;
    }
}