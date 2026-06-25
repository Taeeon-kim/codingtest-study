class Solution {
    public long solution(long n) {
       System.out.println((int) Math.sqrt(3));
        int sqrt = (int) Math.sqrt(n);
        if((long) Math.pow(sqrt, 2) == n) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }
}