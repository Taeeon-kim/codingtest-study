class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            char max = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = max;
                }    
            }
           
        }
        return new String(arr);
    }
}