class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low;i<=high;i++){
            if (isSym(i)) count ++;
        }
        return count;
        
    }
    public boolean isSym(int num){
        String s = "" + num;
        if (s.length()%2!=0) return false;
        int left = 0;
        int right = 0;
        int n = s.length();
        for (int i=0;i<n/2;i++){
            left = left + s.charAt(i)-'0';
            right = right + s.charAt(i+n/2)-'0';
        }
        return left==right;

    }
}