class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int starNum = phone_number.length() - 4;
        String lastFourNum = phone_number.substring(starNum);
        String star = "";
        for(int i = 0; i < starNum; i++){
            star+= "*";
        } 
        return star + lastFourNum;
    }
}