class Solution {
    public int minChanges(String s) {
        char [] ac = s.toCharArray();
        int n = s.length();
        int st = 0;
        int count = 0;
        while (st<n){
            if (ac[st]!=ac[st+1]) count ++;
            st+=2;
        }
        return count;
        
    }
}