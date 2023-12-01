class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        return x == rev(x);
    }
    public int rev(int x){
        int re = 0;
        
        while (x!=0){
            re = 10*re + x %10;
            x = x/10;
        }
        return re;
    }
}