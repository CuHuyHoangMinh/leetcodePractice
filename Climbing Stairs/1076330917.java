class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int a = 1;
        int b = 2;
        int c = 2;
        int count = 2;
        while (count<n){
            count++;
            c = a + b;
            a = b;
            b = c;
        }
        return c;
        
    }
}