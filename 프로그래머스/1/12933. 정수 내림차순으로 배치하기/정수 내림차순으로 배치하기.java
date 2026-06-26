import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] array = String.valueOf(n).split("");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(Integer.valueOf(array[j]) > Integer.valueOf(array[i])){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    
        StringBuilder sb = new StringBuilder();
        for(String s : array){
            sb.append(s);
        }
        long result = Long.parseLong(sb.toString());
        return result;
    }
}